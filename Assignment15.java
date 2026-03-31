import java.util.Scanner;
abstract class Ride {
    double distance;
    Ride(double distance) {
        this.distance = distance;
    }
    abstract double calculateFare();
}
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }
    double calculateFare() {
        return distance * 5;
    }
}
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }
    double calculateFare() {
        return distance * 8;
    }
}
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }
    double calculateFare() {
        return distance * 12;
    }
}
public class Assignment15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ride[] rides = new Ride[3];
        System.out.println("Enter bike ride distance:");
        double d1 = sc.nextDouble();
        System.out.println("Enter auto ride distance:");
        double d2 = sc.nextDouble();
        System.out.println("Enter car ride distance:");
        double d3 = sc.nextDouble();
        rides[0] = new BikeRide(d1);
        rides[1] = new AutoRide(d2);
        rides[2] = new CarRide(d3);
        for(int i = 0; i < rides.length; i++) {
            System.out.println("Total Fare: " + rides[i].calculateFare());
        }
    }
}
