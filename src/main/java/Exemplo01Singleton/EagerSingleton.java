package Exemplo01Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("aaa");
    }
    public static EagerSingleton getInstance(){
        return instance;
    }
}
