class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class Assignment9 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 integers: " + calc.add(5, 10));
        System.out.println("Add 3 integers: " + calc.add(1, 2, 3));
        System.out.println("Add 2 doubles: " + calc.add(4.5, 3.2));
    }
}
