public class TV extends FlightSeatDecorator {
    public TV(FlightSeat flightSeat) {
        super(flightSeat);
        System.out.println("created tv");
    }

    @Override
    public String getDescription() {
        return flightSeat.getDescription()+", tv";
    }

    @Override
    public double getCost() {
        return flightSeat.getCost()+200;
    }
}
