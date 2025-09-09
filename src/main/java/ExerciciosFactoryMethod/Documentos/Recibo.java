package ExerciciosFactoryMethod.Documentos;

public class Recibo implements Documento {
    @Override
    public void assinar() {
        System.out.println("Recibo assinado eletronicamente.");
    }
}
