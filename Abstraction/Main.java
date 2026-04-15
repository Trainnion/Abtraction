public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new BasicPassenger(4.5);

        Transportation bus = new Transportation();

        bus.addPassenger(passenger1);

        System.out.println(bus.calculateTotalEarnings());
    }
}
