package Exemplo02FactoryMethod.ExNotification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Enviado por EMAIL: "+message);
    }
}
