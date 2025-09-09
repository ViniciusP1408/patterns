package Exemplo03Builder;

import Exemplo03Builder.ExPizza.Pizza;
import Exemplo03Builder.ExPizza.PizzaBuilder;

public class App {
    public static void main(String[] args) {
        PizzaBuilder pb = new PizzaBuilder();
        Pizza pizza = pb.massa("Integral").build();


        System.out.println(pizza);
    }
}
