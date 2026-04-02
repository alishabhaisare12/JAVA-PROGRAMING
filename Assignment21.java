import java.util.Scanner;

class UsernameValidator {
    String username;

    UsernameValidator(String username) {
        this.username = username;
    }

    void cleanUsername() {
        username = username.trim().toLowerCase();
        System.out.println("Cleaned Username: " + username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String input = sc.nextLine();

        UsernameValidator user = new UsernameValidator(input);
        user.cleanUsername();
    }
}
