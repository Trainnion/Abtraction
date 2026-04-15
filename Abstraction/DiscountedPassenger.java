public class DiscountedPassenger extends Passenger{
    private double totalPayment = 0;
    private static final double BASE_COST = 20.0;
    private double distance; 

    public DiscountedPassenger (double distance) {
        super(distance);
    }

    @Override
    public double getRideCost() {
        totalPayment =BASE_COST;

        if (distance > 4) {
            totalPayment += (distance - 4 ) * 2;
        }
        return totalPayment - (totalPayment * 0.20);
    }
}