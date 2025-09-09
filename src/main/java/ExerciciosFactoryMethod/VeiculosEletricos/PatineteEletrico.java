package ExerciciosFactoryMethod.VeiculosEletricos;

public class PatineteEletrico implements VeiculoEletrico {
    @Override
    public void carregar() {
        System.out.println("Carregando Patinete Elétrico via USB-C.");
    }
}
