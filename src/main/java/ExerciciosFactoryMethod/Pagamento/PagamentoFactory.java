package ExerciciosFactoryMethod.Pagamento;

public final class PagamentoFactory {
    private PagamentoFactory() {}

    public static Pagamento criar(String metodo) {
        if (metodo == null) throw new IllegalArgumentException("método não pode ser nulo");
        switch (metodo.toLowerCase()) {
            case "credito":
            case "cartao_credito":
            case "cartão_crédito":
            case "cartao de credito":
                return new CartaoCredito();
            case "debito":
            case "cartao_debito":
            case "cartão_débito":
            case "cartao de debito":
                return new CartaoDebito();
            case "boleto":
                return new Boleto();
            default:
                throw new IllegalArgumentException("Método de pagamento desconhecido: " + metodo);
        }
    }
}
