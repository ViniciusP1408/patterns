package ExerciciosFactoryMethod.VeiculosEletricos;

public class App {
    public static void main(String[] args) {
        VeiculoEletrico carro = VeiculoEletricoFactory.criar("carro");
        VeiculoEletrico moto = VeiculoEletricoFactory.criar("moto");
        VeiculoEletrico patinete = VeiculoEletricoFactory.criar("patinete");
        carro.carregar();
        moto.carregar();
        patinete.carregar();
    }
}
