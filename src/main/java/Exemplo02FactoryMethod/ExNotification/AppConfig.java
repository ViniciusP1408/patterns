package Exemplo02FactoryMethod.ExNotification;

public class AppConfig {

    public Notification emailNotification(){
        return new EmailNotification();
    }

    public Notification smslNotification(){
        return new SmsNotification();
    }
}
