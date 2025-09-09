package ExerciciosSingleton;

public class AppLogger {
    public static void main(String[] args) {
        LoggerGlobal logger = LoggerGlobal.getInstance();
        logger.addLog("Aplicação iniciada");
        logger.addLog("Carregando módulos");
        logger.printLogs();
    }
}
