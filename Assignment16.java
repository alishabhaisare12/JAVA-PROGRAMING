import java.util.Scanner;
class Staff {
    void work() {
        System.out.println("Doing general hospital work");
    }
}
class Doctor extends Staff {
    void work() {
        System.out.println("Doctor is checking patients");
    }
}
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse is assisting patients");
    }
}
class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist is handling front desk");
    }
}
public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice (1-Doctor, 2-Nurse, 3-Receptionist):");
        int choice = sc.nextInt();
        Staff s;
        if(choice == 1) {
            s = new Doctor();
        } else if(choice == 2) {
            s = new Nurse();
        } else {
            s = new Receptionist();
        }
        s.work();
    }
}
