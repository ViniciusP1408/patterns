package ExerciciosFactoryMethod.Pagamento;

public class App {
    public static void main(String[] args) {
        Pagamento p1 = PagamentoFactory.criar("credito");
        Pagamento p2 = PagamentoFactory.criar("debito");
        Pagamento p3 = PagamentoFactory.criar("boleto");
        p1.realizarPagamento(150.75);
        p2.realizarPagamento(80.50);
        p3.realizarPagamento(39.90);
    }
}
