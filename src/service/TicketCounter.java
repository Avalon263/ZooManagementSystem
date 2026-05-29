package service;

public class TicketCounter {

    private double ticketPrice = 100.0;

    // Method overloading
    public void sellTicket() {

        System.out.println(
                "One ticket sold for "
                        + ticketPrice
                        + " ETB"
        );
    }

    public void sellTicket(int visitors) {

        double total = visitors * ticketPrice;

        System.out.println(
                visitors
                        + " tickets sold. Total = "
                        + total
                        + " ETB"
        );
    }
}