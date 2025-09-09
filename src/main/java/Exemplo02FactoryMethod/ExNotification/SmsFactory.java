package Exemplo02FactoryMethod.ExNotification;

public class SmsFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
