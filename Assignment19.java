import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Book added: " + title + " by " + author);
    }

    void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}

public class Assignment19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books do you want to add?");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter title of book " + (i+1) + ":");
            String title = sc.nextLine();
            System.out.println("Enter author of book " + (i+1) + ":");
            String author = sc.nextLine();
            System.out.println("Enter price of book " + (i+1) + ":");
            double price = sc.nextDouble();
            sc.nextLine();
            books[i] = new Book(title, author, price);
        }
        System.out.println("\n--- Library Book Details ---");
        for(int i = 0; i < books.length; i++) {
            books[i].showDetails();
        }
    }
}
