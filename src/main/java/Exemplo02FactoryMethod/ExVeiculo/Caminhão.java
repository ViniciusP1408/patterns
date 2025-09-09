package Exemplo02FactoryMethod.ExVeiculo;

public class Caminhão implements Veiculo{
    @Override
    public void entragar() {
        System.out.println("Entrega por Caminhão");
    }
}
