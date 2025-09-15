package ExerciciosAvancadoFactoryMethod.pagamento;

import java.security.SecureRandom;

class BoletoPagamento implements Pagamento {
    private static final SecureRandom rnd = new SecureRandom();

    private static String gerarCodigoNumerico(int digitos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digitos; i++) sb.append(rnd.nextInt(10));
        return sb.toString();
    }

    @Override
    public Recibo pagar(double valor) {
        double taxa = 1.50; // taxa fixa simulada
        String codigo = gerarCodigoNumerico(47); // linha digitável simulada
        return new Recibo("Boleto", valor, taxa, codigo, "PENDENTE", null);
    }
}
