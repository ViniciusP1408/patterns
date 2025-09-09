package Exemplo02FactoryMethod.ExFormas;

public class Square extends Shape {
    public double size;

    @Override
    public double calcularArea(){
        return size * size;
    }
}
