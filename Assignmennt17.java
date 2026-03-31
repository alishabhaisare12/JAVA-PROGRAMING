import java.util.Scanner;
class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
        System.out.println("New employee added: " + name);
    }

    static void showTotalEmployees() {
        System.out.println("Total employees in the system: " + employeeCount);
    }
}

public class Assignment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you want to add?");
        int n = sc.nextInt();
        sc.nextLine(); 
        Employee[] empList = new Employee[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter name of employee " + (i+1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter id of employee " + (i+1) + ":");
            int id = sc.nextInt();
            sc.nextLine();
            empList[i] = new Employee(name, id);
        }
        Employee.showTotalEmployees();
    }
}
