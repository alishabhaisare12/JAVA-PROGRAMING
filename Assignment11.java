class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of the circle is : " + a);
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double a = length * width;
        System.out.println("Area of the rectangle is : " + a);
    }
}
public class Assignment11 {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(14, 16);

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
