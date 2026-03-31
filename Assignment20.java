import java.util.Scanner;
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Employee Name: " + this.name + ", Salary: ₹" + this.salary);
    }
}

public class Assignment20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = sc.nextLine();
        System.out.println("Enter employee salary:");
        double salary = sc.nextDouble();
        Employee emp = new Employee(name, salary);
        System.out.println("\n--- Employee Details ---");
        emp.showDetails();
    }
}
