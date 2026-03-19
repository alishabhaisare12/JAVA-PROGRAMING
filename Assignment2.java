import java.util.ArrayList;
class Book {
    String title, author, isbn;
    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
    void display() {
        System.out.println(title + " - " + author + " - " + isbn);
    }
}
class Library {
    ArrayList<Book> list = new ArrayList<>();
    void addBook(Book b) {
        list.add(b);
    }
    void removeBook(String isbn) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isbn.equals(isbn)) {
                list.remove(i);
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book not found");
    }
    void displayBooks() {
        for (Book b : list) {
            b.display();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        System.out.println("Books:");
        lib.displayBooks();
        lib.removeBook("101");
        System.out.println("After removal:");
        lib.displayBooks();
    }
}