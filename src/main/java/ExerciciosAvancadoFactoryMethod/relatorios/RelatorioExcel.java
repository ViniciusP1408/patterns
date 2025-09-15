package ExerciciosAvancadoFactoryMethod.relatorios;

class RelatorioExcel implements Relatorio {
    @Override
    public byte[] gerar(String cabecalho, String conteudo, String rodape) {
        // Simula bytes de um arquivo Excel (CSV como proxy)
        String csv = "CABECALHO," + cabecalho + "\nCONTEUDO," + conteudo.replace("\n", " ") + "\nRODAPE," + rodape;
        return csv.getBytes();
    }
}
