package ExerciciosFactoryMethod.VeiculosEletricos;

public class CarroEletrico implements VeiculoEletrico {
    @Override
    public void carregar() {
        System.out.println("Carregando Carro Elétrico na tomada AC.");
    }
}
