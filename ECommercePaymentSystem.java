
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

abstract class PaymentFactory {
    public abstract Payment createPayment();
}

class CreditCardPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

class PayPalPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new PayPalPayment();
    }
}

class UpiPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new UpiPayment();
    }
}

// Client
public class ECommercePaymentSystem {
    public static void main(String[] args) {
        // Simulated user input
        String paymentType = "UPI";  // Try "CreditCard" or "PayPal"
        double amount = 1599.00;

        PaymentFactory factory;

        switch (paymentType) {
            case "CreditCard":
                factory = new CreditCardPaymentFactory();
                break;
            case "PayPal":
                factory = new PayPalPaymentFactory();
                break;
            case "UPI":
                factory = new UpiPaymentFactory();
                break;
            default:
                throw new IllegalArgumentException("Unsupported payment method: " + paymentType);
        }

        Payment payment = factory.createPayment();
        payment.pay(amount);
    }
}
