import java.util.Date;

public class StandardTicket extends Ticket {

    public StandardTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount, 0);
    }

    public StandardTicket(Date eventDate, int ticketCount, double discount) {
        super(eventDate, ticketCount, discount);
    }

    public void printTicketType() {
        System.out.println("Ticket Type: Standard");
    }

    @Override
    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.println("Can be canceled within 24 hours before the event. Cancellation fee applies.");
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printCancellationPolicy();
    }

}
