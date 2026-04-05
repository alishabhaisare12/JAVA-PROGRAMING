class Account {
    int balance = 1000;

    void withdraw(String user, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(user + " deducted " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(user + " cannot deduct " + amount + " (Insufficient balance)");
            }
        }
    }
}

class BankingSystem extends Thread {
    Account acc;
    String user;
    int amount;

    BankingSystem(Account acc, String user, int amount) {
        this.acc = acc;
        this.user = user;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(user, amount);
    }

    public static void main(String[] args) {
        Account a = new Account();

        BankingSystem t1 = new BankingSystem(a, "User1", 400);
        BankingSystem t2 = new BankingSystem(a, "User2", 500);
        BankingSystem t3 = new BankingSystem(a, "User3", 300);

        t1.start();
        t2.start();
        t3.start();
    }
}
