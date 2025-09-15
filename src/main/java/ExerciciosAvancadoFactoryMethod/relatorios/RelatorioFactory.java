package ExerciciosAvancadoFactoryMethod.relatorios;

public class RelatorioFactory {
    public static Relatorio criar(Formato formato) {
        switch (formato) {
            case PDF: return new RelatorioPdf();
            case HTML: return new RelatorioHtml();
            case EXCEL: return new RelatorioExcel();
            default: throw new IllegalArgumentException("Formato não suportado: " + formato);
        }
    }
}
