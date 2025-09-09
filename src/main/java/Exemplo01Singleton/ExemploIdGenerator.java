package Exemplo01Singleton;

public class ExemploIdGenerator {
    public void usarId(){
        IdGenerator generator = IdGenerator.getInstance();

        System.out.println(generator.getNextId());
        System.out.println(generator.getNextId());

    }
}
