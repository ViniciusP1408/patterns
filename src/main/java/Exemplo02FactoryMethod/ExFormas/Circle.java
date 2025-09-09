package Exemplo02FactoryMethod.ExFormas;

public class Circle extends Shape {
    public double raio;
    public double diametro;

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
