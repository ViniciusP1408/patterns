package ExerciciosAvancadoFactoryMethod.transporte;

class Taxi implements Transporte {
    private final double precoPorKm;

    Taxi(double precoPorKm) { this.precoPorKm = precoPorKm; }

    @Override
    public double estimarCusto(double distanciaKm, int minutos) {
        return 5.0 + distanciaKm * precoPorKm; // bandeirada + por km
    }

    @Override
    public String descricao() { return "Táxi (R$" + precoPorKm + "/km)"; }
}
