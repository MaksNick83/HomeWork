
public class Passenger extends TaxiDepot {
    private int seatsNumber;

    public Passenger(int cost, int consumption, int speed, int seatsNumber) {
        super(cost, consumption, speed);
        this.seatsNumber = seatsNumber;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "countSeats=" + seatsNumber +
                ", cost=" + cost +
                ", consumption=" + consumption +
                ", speed=" + speed +
                '}';
    }
}
