package ExerciciosAvancadoSingleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.Objects;

public final class LoggerMultinivel {
    public enum Level { INFO, WARN, ERROR }

    private volatile EnumSet<Level> enabled = EnumSet.of(Level.INFO, Level.WARN, Level.ERROR);
    private final Object lock = new Object();
    private Path filePath;

    private LoggerMultinivel() {
        try {
            this.filePath = Path.of("logs-app.txt");
            if (!Files.exists(filePath)) Files.createFile(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Falha ao inicializar arquivo de log", e);
        }
    }

    private static class Holder { private static final LoggerMultinivel INSTANCE = new LoggerMultinivel(); }
    public static LoggerMultinivel getInstance() { return Holder.INSTANCE; }

    public void setEnabled(Level... levels) {
        if (levels == null || levels.length == 0) {
            enabled = EnumSet.noneOf(Level.class);
        } else {
            EnumSet<Level> set = EnumSet.noneOf(Level.class);
            for (Level l : levels) set.add(l);
            enabled = set; // volatile troca atômica
        }
    }

    public void setLogFile(Path path) {
        Objects.requireNonNull(path);
        synchronized (lock) {
            this.filePath = path;
            try { if (!Files.exists(filePath)) Files.createFile(filePath); }
            catch (IOException e) { throw new RuntimeException(e); }
        }
    }

    public void info(String msg) { log(Level.INFO, msg); }
    public void warn(String msg) { log(Level.WARN, msg); }
    public void error(String msg) { log(Level.ERROR, msg); }

    private void log(Level level, String msg) {
        if (!enabled.contains(level)) return;
        String line = String.format("%s [%s] %s", LocalDateTime.now(), level, msg);
        // console
        System.out.println(line);
        // arquivo
        synchronized (lock) {
            try (PrintWriter out = new PrintWriter(new FileWriter(filePath.toFile(), true))) {
                out.println(line);
            } catch (IOException e) {
                System.err.println("Falha ao escrever log em arquivo: " + e.getMessage());
            }
        }
    }
}
