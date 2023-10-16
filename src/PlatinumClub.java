public class PlatinumClub extends MovieClub {
    public PlatinumClub(double price) {
        super.setTicketPrice(price);
    }
    private double fee = 30;
    private String benefits = "Free soda and popcorn refill, buddy passes";
    private double freePasses = 1;
    private double ticketDiscount = .8;

    public double getYearlyClubFee() {
        return fee;
    }
    public String getBenefits() {
        return benefits;
    }
    public double getFreePasses() {
        return freePasses;
    }

    public String toString() {
        return "Platinum Club: " + getBenefits() + " Fee: " + getYearlyClubFee() + " Free passes: " + getFreePasses() + " Ticket Price: " + super.getTicketPrice()*(1-ticketDiscount);
    }
}