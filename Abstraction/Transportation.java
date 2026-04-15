import java.util.ArrayList;
import java.util.List;


public class Transportation {

    private List<Passenger> passengers = new ArrayList<Passenger>();
   

    public void addPassenger (Passenger passenger) {
        passengers.add(passenger);
    }

    public double calculateTotalEarnings() {
        double totalEarnings = 0;

        for (Passenger passenger : passengers){
            totalEarnings += passenger.getRideCost();
        }

        return totalEarnings;
    } 
}
 