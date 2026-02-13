import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StandardTicket extends Ticket {

    public StandardTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        return super.ticketCount * (super.getBasePrice() * (1 + super.getTax()));
    }

    public void printTicketType() {
        System.out.println("Ticket Type: Standard");
    }

    public void printPrice() {
        BigDecimal decimalFormatter = new BigDecimal(getTotalPrice()).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue());
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
