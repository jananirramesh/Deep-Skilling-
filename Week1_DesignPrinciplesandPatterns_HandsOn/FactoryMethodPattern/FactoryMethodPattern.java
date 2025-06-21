// Product interface
interface Notification {
    void notifyUser();
}

// Concrete Products
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}

// Creator abstract class
abstract class NotificationFactory {
    // Factory Method
    public abstract Notification createNotification();

    // Optional: template method to execute full notification flow
    public void sendNotification() {
        Notification notification = createNotification();
        System.out.println("[LOG] Preparing to send notification...");
        notification.notifyUser();
        System.out.println("[LOG] Notification sent successfully.\n");
    }
}

// Concrete Creators
class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

// Client and Factory Manager using Enum (enhanced dynamic selection)
enum NotificationType {
    EMAIL, SMS, PUSH
}

class NotificationService {
    public static NotificationFactory getFactory(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotificationFactory();
            case SMS -> new SMSNotificationFactory();
            case PUSH -> new PushNotificationFactory();
        };
    }
}

// Main class with unique name
public class FactoryMethodPattern {
    public static void main(String[] args) {
        // Dynamic factory selection using enum
        NotificationFactory emailFactory = NotificationService.getFactory(NotificationType.EMAIL);
        emailFactory.sendNotification();

        NotificationFactory smsFactory = NotificationService.getFactory(NotificationType.SMS);
        smsFactory.sendNotification();

        NotificationFactory pushFactory = NotificationService.getFactory(NotificationType.PUSH);
        pushFactory.sendNotification();
    }
}
