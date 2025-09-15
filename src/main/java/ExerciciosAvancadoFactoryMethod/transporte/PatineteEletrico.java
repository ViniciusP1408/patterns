package ExerciciosAvancadoFactoryMethod.transporte;

class PatineteEletrico implements Transporte {
    private final double precoPorMinuto;
    private final int bateriaPercentual;

    PatineteEletrico(double precoPorMinuto, int bateriaPercentual) {
        this.precoPorMinuto = precoPorMinuto;
        this.bateriaPercentual = bateriaPercentual;
    }

    @Override
    public double estimarCusto(double distanciaKm, int minutos) {
        if (bateriaPercentual < 15) return Double.POSITIVE_INFINITY; // não disponível
        return minutos * precoPorMinuto;
    }

    @Override
    public String descricao() { return "Patinete (bateria " + bateriaPercentual + "%)"; }
}
