package ExerciciosAvancadoFactoryMethod.pagamento;

import java.util.UUID;

class StripePagamento implements Pagamento {
    @Override
    public Recibo pagar(double valor) {
        double taxa = valor * 0.029 + 0.20; // 2.9% + 0.20
        String codigo = "STP-" + UUID.randomUUID();
        return new Recibo("Stripe", valor, taxa, codigo, "APROVADO", null);
    }
}
