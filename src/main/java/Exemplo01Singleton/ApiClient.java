package Exemplo01Singleton;

public class ApiClient {
    private static ApiClient instance;
    private String token;

    private ApiClient(){
        this.token = "MINHA TOKEN DA API";
    }

    public static ApiClient getInstance(){
        if(instance == null) {
            instance = new ApiClient();
        }
        return instance;
    }

    public void call(String endpoint){
        System.out.println("Chamada "+endpoint+" com token: " +token);
    }
}
