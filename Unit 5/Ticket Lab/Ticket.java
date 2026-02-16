import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {
    private static final double BASE_PRICE = 20.0; // static variables are shared
    private static final double TAX = 0.0924; // cannot be changed due to 'final'

    protected String eventDate;
    protected int ticketCount;
    protected double discount;

    public Ticket(Date eventDate, int ticketCount, double discount) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        this.eventDate = simpleDateFormat.format(eventDate);
        this.ticketCount = ticketCount;
        this.discount = discount;
    }

    // concrete methods
    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getTax() {
        return TAX;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void printTicketDetails() {
        System.out.println("== RECEIPT ==\nEvent Date: " + eventDate + "\nCount: " + ticketCount);
    }

    public void printCancellationPolicy() {
        System.out.print("Cancellation Policy: ");
    }

    public double getTotalPrice() {
        return (1 - discount) * ticketCount * BASE_PRICE * (1 + TAX);
    }

    public void printPrice() {
        BigDecimal decimalFormatter = new BigDecimal(getTotalPrice()).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue());
    }

    // abstract methods
    public abstract void printTicketType();

}
