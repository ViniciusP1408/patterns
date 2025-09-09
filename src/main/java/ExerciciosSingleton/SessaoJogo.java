package ExerciciosSingleton;

public final class SessaoJogo {
    private int pontuacao;
    private int nivel;
    private int vidas;

    private SessaoJogo() {
        this.pontuacao = 0;
        this.nivel = 1;
        this.vidas = 3;
    }

    private static class Holder {
        private static final SessaoJogo INSTANCE = new SessaoJogo();
    }

    public static SessaoJogo getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void adicionarPontuacao(int pontos) {
        if (pontos < 0) return;
        this.pontuacao += pontos;
    }

    public synchronized void proximoNivel() {
        this.nivel += 1;
    }

    public synchronized void perderVida() {
        if (vidas > 0) this.vidas -= 1;
    }

    public synchronized void ganharVida() {
        this.vidas += 1;
    }

    public synchronized int getPontuacao() { return pontuacao; }
    public synchronized int getNivel() { return nivel; }
    public synchronized int getVidas() { return vidas; }
}
