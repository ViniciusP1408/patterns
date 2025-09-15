package ExerciciosAvancadoFactoryMethod.pagamento;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

class PixPagamento implements Pagamento {
    @Override
    public Recibo pagar(double valor) {
        double taxa = 0.0; // sem taxa
        String codigo = "PIX-" + UUID.randomUUID();
        Instant expiraEm = Instant.now().plus(Duration.ofMinutes(30)); // expira em 30 min
        return new Recibo("PIX", valor, taxa, codigo, "PENDENTE", expiraEm);
    }
}
