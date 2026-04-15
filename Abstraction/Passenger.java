public abstract class Passenger {
    protected double distance;
    protected static final double BASE_COST = 20.0;

    public Passenger(double distance) {
        this.distance = distance;
    }

    public abstract double getRideCost();
}
