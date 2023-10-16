public class SeniorClub extends MovieClub  {
    /***
     * Stores the price of the ticket to movieclub
     * @param price Price of ticket
     */
    public SeniorClub(double price) {
        super.setTicketPrice(price);
    }
    private double fee = 5;
    private String benefits = "Free child-sized popcorn & soda";
    private double freePasses = 0;
    private double ticketDiscount = .5;

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
        return "Senior Club: " + getBenefits() + " Fee: " + getYearlyClubFee() + " Free passes: " + getFreePasses() + " Ticket Price: " + super.getTicketPrice()*(1-ticketDiscount);
    }
}