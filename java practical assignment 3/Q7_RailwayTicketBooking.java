import java.util.Scanner;

class TicketBooking {
    int availableSeats;

    TicketBooking(int seats) {
        availableSeats = seats;
    }

    synchronized void bookSeat(int seats, String user) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(user + " booked " + seats + " seat(s) successfully");
        } else {
            System.out.println(user + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    TicketBooking t;

    User1(TicketBooking t) {
        this.t = t;
    }

    public void run() {
        t.bookSeat(1, "User1");
    }
}

class User2 extends Thread {
    TicketBooking t;

    User2(TicketBooking t) {
        this.t = t;
    }

    public void run() {
        t.bookSeat(2, "User2");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Available Seats: ");
        int seats = sc.nextInt();

        TicketBooking t = new TicketBooking(seats);

        User1 u1 = new User1(t);
        User2 u2 = new User2(t);

        u1.start();
        u1.join();

        u2.start();
        u2.join();
    }
}