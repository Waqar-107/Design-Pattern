public class Client {
    public static void main(String[] args){
        FlightSeat flightSeat1=new WiFi(new TV(new PremiumSeat()));
        FlightSeat flightSeat2=new TV(new NormalSeat());

        System.out.println("---------------------------------");
        System.out.println("seat-1, description");
        System.out.println(flightSeat1.getDescription()+". cost: "+flightSeat1.getCost());
        System.out.println("---------------------------------");

        System.out.println("seat-2, description");
        System.out.println(flightSeat2.getDescription()+". cost: "+flightSeat2.getCost());
        System.out.println("---------------------------------");
    }
}
