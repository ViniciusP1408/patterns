package ExerciciosAvancadoFactoryMethod.pagamento;

import java.util.UUID;

class PaypalPagamento implements Pagamento {
    @Override
    public Recibo pagar(double valor) {
        double taxa = valor * 0.035 + 0.30; // 3.5% + 0.30
        String codigo = "PAY-" + UUID.randomUUID();
        return new Recibo("PayPal", valor, taxa, codigo, "APROVADO", null);
    }
}
