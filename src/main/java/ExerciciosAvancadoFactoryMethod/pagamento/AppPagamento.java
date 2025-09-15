package ExerciciosAvancadoFactoryMethod.pagamento;

public class AppPagamento {
    public static void main(String[] args) {
        Pagamento pgPix = PagamentoFactory.criar(Provedor.PIX);
        System.out.println(pgPix.pagar(150.0));

        Pagamento pgPaypal = PagamentoFactory.criar(Provedor.PAYPAL);
        System.out.println(pgPaypal.pagar(200.0));

        Pagamento pgBoleto = PagamentoFactory.criar(Provedor.BOLETO);
        System.out.println(pgBoleto.pagar(300.0));

        Pagamento pgStripe = PagamentoFactory.criar(Provedor.STRIPE);
        System.out.println(pgStripe.pagar(450.0));
    }
}
