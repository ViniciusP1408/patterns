package Exemplo03Builder.ExPizza;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder(){
        pizza =  new Pizza();
    }
    public PizzaBuilder molho(String molho){
        pizza.setMolho(molho);
        return this;
    }

    public PizzaBuilder massa(String massa){
        pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder queijo(String queijo){
        queijo = "Queijo "+queijo;
        pizza.setQueijo(queijo);
        return this;
    }

    public PizzaBuilder pepperoni(boolean pepperoni){
        pizza.setHasPepperoni(pepperoni);
        return this;
    }

    public PizzaBuilder bacon(boolean bacon){
        pizza.setHasBacon(bacon);
        return this;
    }

    public Pizza build(){
        return pizza;
    }



}
