package ExerciciosBuilder;

import java.util.Objects;

public class Computador {
    private final String cpu;
    private final String gpu;
    private final Integer ramGb;
    private final Integer ssdGb;
    private final String placaMae;
    private final String cooler;

    private Computador(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ramGb = builder.ramGb;
        this.ssdGb = builder.ssdGb;
        this.placaMae = builder.placaMae;
        this.cooler = builder.cooler;
    }

    public static class Builder {
        private String cpu;
        private String gpu;
        private Integer ramGb;
        private Integer ssdGb;
        private String placaMae;
        private String cooler;

        public Builder cpu(String cpu) { this.cpu = cpu; return this; }
        public Builder gpu(String gpu) { this.gpu = gpu; return this; }
        public Builder ramGb(Integer ramGb) { this.ramGb = ramGb; return this; }
        public Builder ssdGb(Integer ssdGb) { this.ssdGb = ssdGb; return this; }
        public Builder placaMae(String placaMae) { this.placaMae = placaMae; return this; }
        public Builder cooler(String cooler) { this.cooler = cooler; return this; }

        public Computador build() {
            if (cpu == null && ramGb == null && ssdGb == null && gpu == null && placaMae == null && cooler == null) {
                throw new IllegalStateException("Selecione pelo menos um componente (ex.: CPU, RAM ou SSD)");
            }
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ramGb=" + ramGb +
                ", ssdGb=" + ssdGb +
                ", placaMae='" + placaMae + '\'' +
                ", cooler='" + cooler + '\'' +
                '}';
    }
}
