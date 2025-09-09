package ExerciciosFactoryMethod.Documentos;

public final class DocumentoFactory {
    private DocumentoFactory() {}

    public static Documento criar(String tipo) {
        if (tipo == null) throw new IllegalArgumentException("tipo não pode ser nulo");
        switch (tipo.toLowerCase()) {
            case "contrato":
                return new Contrato();
            case "notafiscal":
            case "nota_fiscal":
            case "nota fiscal":
                return new NotaFiscal();
            case "recibo":
                return new Recibo();
            default:
                throw new IllegalArgumentException("Tipo de documento desconhecido: " + tipo);
        }
    }
}
