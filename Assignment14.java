import java.util.Scanner;
class Person {
    void role() {
        System.out.println("Role: Person");
    }
}
class Employee extends Person {
    void role() {
        System.out.println("Role: Employee");
    }
}
class Manager extends Employee {
    void role() {
        System.out.println("Role: Manager");
    }
}
public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice (1-Person, 2-Employee, 3-Manager):");
        int choice = sc.nextInt();
        Person p;
        if(choice == 1) {
            p = new Person();
        } else if(choice == 2) {
            p = new Employee();
        } else {
            p = new Manager();
        }
        p.role();
    }
}
