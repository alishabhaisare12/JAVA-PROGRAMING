import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    double Charges;
    int Days;

    static Scanner sc = new Scanner(System.in);

    double Compute() {
        double amount = Days * Charges;

        if (amount > 11000) {
            amount = 1.02 * amount; 
        }
        return amount;
    }

    void Getinfo() {
        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        double amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days Stayed: " + Days);
        System.out.println("Total Amount: " + amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();

        sc.close(); 
    }
}
