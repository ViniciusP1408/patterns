package Exemplo02FactoryMethod.ExFormas;

public class App {
    public static void main(String[] args) {

         Shape shape1 = ShapeFactory.getShape("circle");
         Shape shape2 = ShapeFactory.getShape("square");
         Shape shape3 = ShapeFactory.getShape("asda");




    }
}
