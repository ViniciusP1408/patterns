package ExerciciosAvancadoSingleton;

import java.nio.file.Path;

public class AppLogger {
    public static void main(String[] args) {
        LoggerMultinivel log = LoggerMultinivel.getInstance();
        log.setLogFile(Path.of("logs-app.txt"));

        log.info("Sistema iniciando");
        log.warn("Cache quase cheio");
        log.error("Falha crítica X");

        // Desativar INFO em tempo de execução (sem recriar)
        log.setEnabled(LoggerMultinivel.Level.WARN, LoggerMultinivel.Level.ERROR);
        log.info("Esta mensagem não deve aparecer");
        log.warn("Modo manutenção");
        log.error("Exceção simulada");

        // Reativar todos
        log.setEnabled(LoggerMultinivel.Level.INFO, LoggerMultinivel.Level.WARN, LoggerMultinivel.Level.ERROR);
        log.info("Encerrando");
    }
}
