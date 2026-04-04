import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double withdraw = sc.nextDouble();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance - withdraw;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
