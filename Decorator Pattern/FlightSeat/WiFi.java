public class WiFi extends FlightSeatDecorator {
    public WiFi(FlightSeat flightSeat) {
        super(flightSeat);
        System.out.println("created wifi");
    }

    @Override
    public String getDescription() {
        return flightSeat.getDescription()+", wifi";
    }

    @Override
    public double getCost() {
        return flightSeat.getCost()+100;
    }
}
