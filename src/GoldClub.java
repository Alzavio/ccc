public class GoldClub extends MovieClub {
    /***
     * Stores the price of the ticket to movieclub
     * @param price Price of ticket
     */
    public GoldClub(double price) {
        super.setTicketPrice(price);
    }
    private double fee = 15;
    private String benefits = "Free soda refill";
    private double freePasses = 0;
    private double ticketDiscount = .9;

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
        return "Gold Club: " + getBenefits() + " Fee: " + getYearlyClubFee() + " Free passes: " + getFreePasses() + " Ticket Price: " + super.getTicketPrice()*(1-ticketDiscount);
    }
}