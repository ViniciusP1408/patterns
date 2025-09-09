package ExerciciosBuilder;

public class App {
    public static void main(String[] args) {
        Computador gamer = new Computador.Builder()
                .cpu("Ryzen 7 5800X")
                .gpu("RTX 4070")
                .ramGb(32)
                .ssdGb(1000)
                .placaMae("B550")
                .cooler("Water Cooler 240mm")
                .build();

        Computador simples = new Computador.Builder()
                .cpu("i3 10100F")
                .ramGb(8)
                .ssdGb(240)
                .build();

        System.out.println(gamer);
        System.out.println(simples);
    }
}
