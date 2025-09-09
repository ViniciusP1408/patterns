package ExerciciosFactoryMethod.Pagamento;

public class Boleto implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + String.format("%.2f", valor) + ".");
    }
}
