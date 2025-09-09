package Exemplo01Singleton;

public class IdGenerator {
    private static IdGenerator instance;
    private int counter = 0;

    private IdGenerator(){}

    public static synchronized IdGenerator getInstance(){
        if(instance == null)
            instance= new IdGenerator();
        return instance;
    }
    public synchronized int getNextId(){
       return ++counter;
    }

    public static synchronized void  resetInstance(){
        instance = null;
    }

}
