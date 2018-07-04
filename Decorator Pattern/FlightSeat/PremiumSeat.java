public class PremiumSeat implements FlightSeat {
    public PremiumSeat() {
        System.out.println("premium seat created");
    }

    @Override
    public String getDescription() {
        return "premium seat";
    }

    @Override
    public double getCost() {
        return 2000.0;
    }
}
