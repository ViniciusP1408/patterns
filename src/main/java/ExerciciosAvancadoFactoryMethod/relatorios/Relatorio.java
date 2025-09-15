package ExerciciosAvancadoFactoryMethod.relatorios;

public interface Relatorio {
    byte[] gerar(String cabecalho, String conteudo, String rodape);
}
