public class NormalSeat implements FlightSeat {
    public NormalSeat() {
        System.out.println("normal seat created");
    }

    @Override
    public String getDescription() {
        return "normal seat";
    }

    @Override
    public double getCost() {
        return 1500.0;
    }
}
