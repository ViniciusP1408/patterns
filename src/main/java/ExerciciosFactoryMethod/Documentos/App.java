package ExerciciosFactoryMethod.Documentos;

public class App {
    public static void main(String[] args) {
        Documento d1 = DocumentoFactory.criar("contrato");
        Documento d2 = DocumentoFactory.criar("nota fiscal");
        Documento d3 = DocumentoFactory.criar("recibo");
        d1.assinar();
        d2.assinar();
        d3.assinar();
    }
}
