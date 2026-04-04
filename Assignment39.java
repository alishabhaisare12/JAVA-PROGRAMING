class PaymentThread extends Thread {
    public void run() {
        System.out.println("Processing payment...");
    }
}

class OrderThread extends Thread {
    public void run() {
        System.out.println("Order confirmed...");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        PaymentThread p = new PaymentThread();
        OrderThread o = new OrderThread();

        p.start();
        try {
            p.join();
        } catch (Exception e) {
        }
        o.start();
    }
}
