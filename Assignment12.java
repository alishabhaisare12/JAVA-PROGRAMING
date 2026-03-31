import java.util.Scanner;

abstract class Payment {
    abstract void pay(double amount);
}
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}
public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount for Credit Card payment: ");
        double creditAmount = sc.nextDouble();
        System.out.print("Enter amount for UPI payment: ");
        double upiAmount = sc.nextDouble();
        System.out.print("Enter amount for Net Banking payment: ");
        double netAmount = sc.nextDouble();
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();
        p1.pay(creditAmount);
        p2.pay(upiAmount);
        p3.pay(netAmount);
    }
}
