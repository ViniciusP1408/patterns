package ExerciciosFactoryMethod.Documentos;

public class NotaFiscal implements Documento {
    @Override
    public void assinar() {
        System.out.println("Nota Fiscal assinada com certificado A1.");
    }
}
