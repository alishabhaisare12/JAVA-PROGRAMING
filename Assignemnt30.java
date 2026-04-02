import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String masked = password;
        for (int i = 0; i < password.length() - 2; i++) {
            masked = masked.replace(password.charAt(i), '*');
        }

        System.out.println("Masked Password: " + masked);
    }
}
