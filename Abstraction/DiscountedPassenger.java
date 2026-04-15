public class DiscountedPassenger extends Passenger {
    private double totalPayment = 0;

    public DiscountedPassenger(double distance) {
        super(distance);
    }

    @Override
    public double getRideCost() {
        totalPayment = BASE_COST;

        if (distance > 4) {
            totalPayment += (distance - 4) * 2;
        }
        return totalPayment - (totalPayment * 0.20);
    }
}