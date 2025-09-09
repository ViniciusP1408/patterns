package ExerciciosSingleton;

public class AppSessaoJogo {
    public static void main(String[] args) {
        SessaoJogo sessao = SessaoJogo.getInstance();
        System.out.println("Estado inicial: nivel=" + sessao.getNivel() + ", vidas=" + sessao.getVidas() + ", pontos=" + sessao.getPontuacao());
        sessao.adicionarPontuacao(100);
        sessao.proximoNivel();
        sessao.perderVida();
        System.out.println("Estado atual: nivel=" + sessao.getNivel() + ", vidas=" + sessao.getVidas() + ", pontos=" + sessao.getPontuacao());
    }
}
