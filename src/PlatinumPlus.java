public class PlatinumPlus extends PlatinumClub {
    public PlatinumPlus(double price) {
        super(price);
    }
    public double getYearlyClubFee() {
        return super.getYearlyClubFee()+10;
    }

    public double getFreePasses() {
        return super.getFreePasses()+2;
    }

    public String toString() {
        return "Platinum Plus: " + super.getBenefits() + " Fee: " + getYearlyClubFee() + " Free passes: " + getFreePasses();
    }

}
