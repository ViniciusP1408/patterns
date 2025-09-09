package ExerciciosSingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoggerGlobal {
    private final List<String> logs = new ArrayList<>();

    private LoggerGlobal() {}

    private static class Holder {
        private static final LoggerGlobal INSTANCE = new LoggerGlobal();
    }

    public static LoggerGlobal getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void addLog(String mensagem) {
        String ts = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        logs.add("[" + ts + "] " + mensagem);
    }

    public synchronized List<String> getLogs() {
        return Collections.unmodifiableList(new ArrayList<>(logs));
    }

    public synchronized void printLogs() {
        if (logs.isEmpty()) {
            System.out.println("[Logger] Nenhum log registrado.");
            return;
        }
        System.out.println("[Logger] Logs acumulados:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
