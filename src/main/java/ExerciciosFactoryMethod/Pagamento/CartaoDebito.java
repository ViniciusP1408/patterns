package ExerciciosFactoryMethod.Pagamento;

public class CartaoDebito implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " via Cartão de Débito realizado.");
    }
}
