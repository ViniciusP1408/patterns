package Exemplo01Singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection (){
        System.out.println("Conexão Iniciada");
    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

}
