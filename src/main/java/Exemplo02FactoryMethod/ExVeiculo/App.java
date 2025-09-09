package Exemplo02FactoryMethod.ExVeiculo;

public class App {
    public static void main(String[] args) {
        VeiculoFactory fabrica1 =  new CaminhaoFactory();
        Veiculo v1 = fabrica1.createVeiculo();
        v1.entragar();

        VeiculoFactory fabrica2 =  new NavioFactory();
        Veiculo v2 = fabrica2.createVeiculo();
        v2.entragar();

    }
}
