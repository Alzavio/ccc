/***
 * Holds ticket price info
 */
public abstract class MovieClub {
    private double ticketPrice = 25;

    public abstract double getYearlyClubFee();
    public abstract String getBenefits();
    public abstract double getFreePasses();

    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}