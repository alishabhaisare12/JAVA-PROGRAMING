import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    static Scanner sc = new Scanner(System.in);

    float Calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    void havedata() {
        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        Calculate();
    }

    void dispdata() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee No: " + empno);
        System.out.println("Name       : " + ename);
        System.out.println("Basic      : " + basic);
        System.out.println("HRA        : " + hra);
        System.out.println("DA         : " + da);
        System.out.println("Net Pay    : " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.havedata();
        e.dispdata();

        sc.close(); //
    }
}