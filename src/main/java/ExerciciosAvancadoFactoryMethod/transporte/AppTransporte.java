package ExerciciosAvancadoFactoryMethod.transporte;

public class AppTransporte {
    public static void main(String[] args) {
        Transporte t1 = TransporteFactory.escolher(2.0, 5.0, 10);
        System.out.println(t1.descricao() + " custo: R$" + t1.estimarCusto(2.0, 10));

        Transporte t2 = TransporteFactory.escolher(8.0, 20.0, 25);
        System.out.println(t2.descricao() + " custo: R$" + t2.estimarCusto(8.0, 25));

        Transporte t3 = TransporteFactory.escolher(1.0, 2.0, 5);
        System.out.println(t3.descricao() + " custo: R$" + t3.estimarCusto(1.0, 5));
    }
}
