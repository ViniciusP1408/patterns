package Exemplo02FactoryMethod.ExNotification;

public class App {
    public static void main(String[] args) {
        NotificationFactory factory = new SmsFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser("Seu pedido está a caminho!");
    }
}
