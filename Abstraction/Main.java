public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new BasicPassenger(5);
        Passenger passenger2 = new BasicPassenger(6);
        Passenger passenger3 = new BasicPassenger(7);
        Passenger passenger4 = new BasicPassenger(8);
        Passenger passenger5 = new DiscountedPassenger(9);
        Passenger passenger6 = new DiscountedPassenger(10);
        Passenger passenger7 = new DiscountedPassenger(11);
        Passenger passenger8 = new DiscountedPassenger(12);

        Transportation bus = new Transportation();

        bus.addPassenger(passenger1);
        bus.addPassenger(passenger2);
        bus.addPassenger(passenger3);
        bus.addPassenger(passenger4);
        bus.addPassenger(passenger5);
        bus.addPassenger(passenger6);
        bus.addPassenger(passenger7);
        bus.addPassenger(passenger8);

        System.out.println(bus.calculateTotalEarnings());
    }
}
