package Exemplo02FactoryMethod.ExVeiculo;

public class CaminhaoFactory extends VeiculoFactory{
    @Override
    public Veiculo createVeiculo() {
        return new Caminhão();
    }
}
