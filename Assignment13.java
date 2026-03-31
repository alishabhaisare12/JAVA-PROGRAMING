import java.util.Scanner;
abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateBonus();
}
class Manager extends Employee {
    double salary;
    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }
    double calculateBonus() {
        return salary * 0.20;
    }
}
class Developer extends Employee {
    double salary;
    double projectIncentive;
    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }
    double calculateBonus() {
        return (salary * 0.10) + projectIncentive;
    }
}
public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manager name:");
        String mName = sc.nextLine();
        System.out.println("Enter Manager id:");
        int mId = sc.nextInt();
        System.out.println("Enter Manager salary:");
        double mSalary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Developer name:");
        String dName = sc.nextLine();
        System.out.println("Enter Developer id:");
        int dId = sc.nextInt();
        System.out.println("Enter Developer salary:");
        double dSalary = sc.nextDouble();
        System.out.println("Enter Project Incentive:");
        double incentive = sc.nextDouble();
        Employee e1 = new Manager(mName, mId, mSalary);
        Employee e2 = new Developer(dName, dId, dSalary, incentive);
        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}
