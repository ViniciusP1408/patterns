package ExerciciosAvancadoSingleton;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

public final class LicencaSoftware {
    private volatile String chaveAtiva;
    private volatile Instant expiraEm;

    private LicencaSoftware() {}

    private static class Holder { private static final LicencaSoftware INSTANCE = new LicencaSoftware(); }
    public static LicencaSoftware getInstance() { return Holder.INSTANCE; }

    public synchronized void ativar(String chave, Duration duracao) {
        Objects.requireNonNull(chave);
        Objects.requireNonNull(duracao);
        if (duracao.isZero() || duracao.isNegative()) throw new IllegalArgumentException("Duração inválida");
        this.chaveAtiva = chave;
        this.expiraEm = Instant.now().plus(duracao);
    }

    public synchronized void desativar() {
        this.chaveAtiva = null;
        this.expiraEm = null;
    }

    public boolean isAtiva() {
        String c = this.chaveAtiva;
        Instant e = this.expiraEm;
        if (c == null || e == null) return false;
        if (Instant.now().isAfter(e)) return false;
        return true;
    }

    private void validarAtivaOuExcecao() {
        if (!isAtiva()) throw new IllegalStateException("Licença expirada ou inexistente. Operações bloqueadas.");
    }

    // Exemplo de operação do sistema que requer licença
    public String operar(String acao) {
        validarAtivaOuExcecao();
        return "Operação executada: " + acao;
    }
}
