class RailwayReservation {
    int tickets = 1;

    synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + ": Ticket booked successfully");
            tickets--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation r = new RailwayReservation();

        Thread t1 = new Thread(() -> r.bookTicket("User1"));
        Thread t2 = new Thread(() -> r.bookTicket("User2"));

        t1.start();
        t2.start();
    }
}
