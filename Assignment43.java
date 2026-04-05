class Sender extends Thread {
    public void run() {
        System.out.println("Sending message...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Message sent.");
    }
}

class Receiver extends Thread {
    public void run() {
        System.out.println("Receiving message...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Message received.");
    }
}

class ChatApplication {
    public static void main(String[] args) {
        Sender s = new Sender();
        Receiver r = new Receiver();

        System.out.println("Sender State before start: " + s.getState());
        System.out.println("Receiver State before start: " + r.getState());

        s.start();
        r.start();

        try {
            s.join();
            r.join();
        } catch (Exception e) {
        }

        System.out.println("Sender State after execution: " + s.getState());
        System.out.println("Receiver State after execution: " + r.getState());
    }
}
