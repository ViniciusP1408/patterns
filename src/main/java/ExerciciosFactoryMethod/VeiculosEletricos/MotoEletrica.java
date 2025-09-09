package ExerciciosFactoryMethod.VeiculosEletricos;

public class MotoEletrica implements VeiculoEletrico {
    @Override
    public void carregar() {
        System.out.println("Carregando Moto Elétrica com carregador portátil.");
    }
}
