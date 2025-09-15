package ExerciciosAvancadoSingleton;

import java.time.Duration;

public class AppLicenca {
    public static void main(String[] args) throws InterruptedException {
        LicencaSoftware licenca = LicencaSoftware.getInstance();
        licenca.ativar("ABC-123", Duration.ofSeconds(2));
        System.out.println(licenca.operar("Salvar documento"));
        Thread.sleep(2200);
        try {
            System.out.println(licenca.operar("Exportar relatório"));
        } catch (IllegalStateException e) {
            System.out.println("Bloqueado: " + e.getMessage());
        }
    }
}
