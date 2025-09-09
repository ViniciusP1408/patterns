package Exemplo01Singleton;

public class App {
    public static void main(String[] args) {
        IdGenerator generator = IdGenerator.getInstance();
        ExemploIdGenerator exemplo =  new ExemploIdGenerator();

        System.out.println(generator.getNextId());
        teste();
        teste();
        teste();
        System.out.println("---");
        IdGenerator.resetInstance();
        exemplo.usarId();
        exemplo.usarId();
        exemplo.usarId();






    }
    public static void teste(){
        IdGenerator generator2 = IdGenerator.getInstance();
        System.out.println(generator2.getNextId());


    }
}
