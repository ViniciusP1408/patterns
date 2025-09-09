package Exemplo02FactoryMethod.ExVeiculo;

public class NavioFactory extends VeiculoFactory{
    @Override
    public Veiculo createVeiculo() {
        return new Navio();
    }
}
