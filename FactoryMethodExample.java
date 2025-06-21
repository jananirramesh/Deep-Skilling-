public class FactoryMethodExample {

    // Product Interface
    interface Notification {
        void notifyUser();
    }

    // Concrete Products
    static class SMSNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending an SMS notification");
        }
    }

    static class EmailNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending an Email notification");
        }
    }

    static class PushNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending a Push notification");
        }
    }

    // Factory Class
    static class NotificationFactory {
        public Notification createNotification(String type) {
            if (type == null || type.isEmpty()) return null;
            switch (type.toUpperCase()) {
                case "SMS":
                    return new SMSNotification();
                case "EMAIL":
                    return new EmailNotification();
                case "PUSH":
                    return new PushNotification();
                default:
                    return null;
            }
        }
    }

    // Client Code (Main Method)
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        if (notification1 != null) {
            notification1.notifyUser();
        }

        Notification notification2 = factory.createNotification("PUSH");
        if (notification2 != null) {
            notification2.notifyUser();
        }

        Notification notification3 = factory.createNotification("SMS");
        if (notification3 != null) {
            notification3.notifyUser();
        }
    }
}
