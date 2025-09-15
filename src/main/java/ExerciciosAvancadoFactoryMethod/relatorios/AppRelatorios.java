package ExerciciosAvancadoFactoryMethod.relatorios;

import java.nio.file.Files;
import java.nio.file.Path;

public class AppRelatorios {
    public static void main(String[] args) throws Exception {
        Relatorio pdf = RelatorioFactory.criar(Formato.PDF);
        Relatorio html = RelatorioFactory.criar(Formato.HTML);
        Relatorio xls = RelatorioFactory.criar(Formato.EXCEL);

        byte[] b1 = pdf.gerar("Vendas", "Conteúdo PDF", "Fim");
        byte[] b2 = html.gerar("Vendas", "<p>Conteúdo HTML</p>", "Fim");
        byte[] b3 = xls.gerar("Vendas", "linha1;linha2;linha3", "Fim");

        Files.write(Path.of("relatorio.pdf.bin"), b1);
        Files.write(Path.of("relatorio.html"), b2);
        Files.write(Path.of("relatorio.xlsx.bin"), b3);
        System.out.println("Arquivos de relatório gerados no diretório do projeto.");
    }
}
