import java.util.Scanner;
class Bank {
    final double interestRate = 7.5;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Assignment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("How many customers do you want to calculate interest for?");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("Enter deposit amount for customer " + i + ":");
            double amount = sc.nextDouble();
            double interest = bank.calculateInterest(amount);
            System.out.println("Customer " + i + " will earn interest: " + interest);
        }
        System.out.println("Note: The bank interest rate is fixed at " + bank.interestRate + "%");
    }
}
