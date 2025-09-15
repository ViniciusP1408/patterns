package ExerciciosAvancadoFactoryMethod.relatorios;

class RelatorioHtml implements Relatorio {
    @Override
    public byte[] gerar(String cabecalho, String conteudo, String rodape) {
        String html = "<html><head><title>Relatório</title></head><body>" +
                "<h1>" + cabecalho + "</h1>" +
                "<div>" + conteudo + "</div>" +
                "<footer>" + rodape + "</footer>" +
                "</body></html>";
        return html.getBytes();
    }
}
