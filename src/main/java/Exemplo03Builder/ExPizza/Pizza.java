package Exemplo03Builder.ExPizza;

public class Pizza {
    private String massa;
    private String molho;
    private String queijo;
    private boolean hasPepperoni;
    private boolean hasBacon;


    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", molho='" + molho + '\'' +
                ", queijo='" + queijo + '\'' +
                ", hasPepperoni=" + hasPepperoni +
                ", hasBacon=" + hasBacon +
                '}';
    }


    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setHasPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    public void setHasBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
    }
}
