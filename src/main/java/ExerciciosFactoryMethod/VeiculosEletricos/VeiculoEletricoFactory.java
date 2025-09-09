package ExerciciosFactoryMethod.VeiculosEletricos;

public final class VeiculoEletricoFactory {
    private VeiculoEletricoFactory() {}

    public static VeiculoEletrico criar(String tipo) {
        if (tipo == null) throw new IllegalArgumentException("tipo não pode ser nulo");
        switch (tipo.toLowerCase()) {
            case "carro":
                return new CarroEletrico();
            case "moto":
                return new MotoEletrica();
            case "patinete":
                return new PatineteEletrico();
            default:
                throw new IllegalArgumentException("Tipo de veículo elétrico desconhecido: " + tipo);
        }
    }
}
