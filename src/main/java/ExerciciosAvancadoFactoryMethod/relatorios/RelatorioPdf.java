package ExerciciosAvancadoFactoryMethod.relatorios;

class RelatorioPdf implements Relatorio {
    @Override
    public byte[] gerar(String cabecalho, String conteudo, String rodape) {
        // Simula binário de PDF
        String texto = "PDF\n" + cabecalho + "\n---\n" + conteudo + "\n---\n" + rodape + "\n";
        return texto.getBytes();
    }
}
