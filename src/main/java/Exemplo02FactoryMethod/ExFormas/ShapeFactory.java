package Exemplo02FactoryMethod.ExFormas;

public class ShapeFactory {
    public static Shape getShape(String type){

        if(type.equalsIgnoreCase("circle")) return new Circle();
        else if(type.equalsIgnoreCase("square")) return new Square();
        throw new IllegalArgumentException("Tipo Inválido");
    }
}
