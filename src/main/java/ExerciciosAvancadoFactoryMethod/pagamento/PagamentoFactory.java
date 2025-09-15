package ExerciciosAvancadoFactoryMethod.pagamento;

public class PagamentoFactory {
    public static Pagamento criar(Provedor provedor) {
        switch (provedor) {
            case PAYPAL: return new PaypalPagamento();
            case STRIPE: return new StripePagamento();
            case PIX: return new PixPagamento();
            case BOLETO: return new BoletoPagamento();
            default: throw new IllegalArgumentException("Provedor não suportado: " + provedor);
        }
    }
}
