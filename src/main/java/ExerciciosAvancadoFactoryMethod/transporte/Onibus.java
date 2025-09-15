package ExerciciosAvancadoFactoryMethod.transporte;

class Onibus implements Transporte {
    private final int limitePassageiros;
    private final String rota;

    Onibus(int limitePassageiros, String rota) {
        this.limitePassageiros = limitePassageiros;
        this.rota = rota;
    }

    @Override
    public double estimarCusto(double distanciaKm, int minutos) {
        return 4.50; // tarifa fixa simulada
    }

    @Override
    public String descricao() { return "Ônibus rota " + rota + " (limite " + limitePassageiros + ")"; }
}
