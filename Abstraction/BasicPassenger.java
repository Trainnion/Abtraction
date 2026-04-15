public class BasicPassenger extends Passenger{
    
    private double totalPayment = 0;
    private static final double BASE_COST = 20.0;
    private double distance; 

    public BasicPassenger (double distance) {
        this.distance = distance;
    }

    @Override
    public double getRideCost() {
        totalPayment = BASE_COST;

        if (distance > 4) {
            totalPayment += (distance - 4 ) * 1.50;
        }
        return totalPayment;
    }
}