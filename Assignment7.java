abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is Shape");
    }
}

class Circle extends Shape {
    void calculate_area() {
        int r = 3;
        double a = 3.14 * r * r;
        System.out.println("Area: " + a);
    }
}

class Rectangle extends Shape {
    void calculate_area() {
        int l = 4;
        int b = 5;
        int a = l * b;
        System.out.println("Area: " + a);
    }
}

public class Assignment7 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display_info();
        c.calculate_area();

        Rectangle r = new Rectangle();
        r.display_info();
        r.calculate_area();
    }
}