import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: Names are same");
        } else {
            System.out.println("Case-sensitive: Names are different");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: Names are same");
        } else {
            System.out.println("Case-insensitive: Names are different");
        }
    }
}
