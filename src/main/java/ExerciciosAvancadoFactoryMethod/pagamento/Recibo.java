package ExerciciosAvancadoFactoryMethod.pagamento;

import java.time.Instant;

public class Recibo {
    public final String provedor;
    public final double valor;
    public final double taxa;
    public final String codigo;
    public final String status;
    public final Instant expiraEm; // usado para PIX

    public Recibo(String provedor, double valor, double taxa, String codigo, String status, Instant expiraEm) {
        this.provedor = provedor;
        this.valor = valor;
        this.taxa = taxa;
        this.codigo = codigo;
        this.status = status;
        this.expiraEm = expiraEm;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "provedor='" + provedor + '\'' +
                ", valor=" + valor +
                ", taxa=" + taxa +
                ", codigo='" + codigo + '\'' +
                ", status='" + status + '\'' +
                (expiraEm != null ? ", expiraEm=" + expiraEm : "") +
                '}';
    }
}
