package ExerciciosAvancadoFactoryMethod.transporte;

public interface Transporte {
    double estimarCusto(double distanciaKm, int minutos);
    String descricao();
}
