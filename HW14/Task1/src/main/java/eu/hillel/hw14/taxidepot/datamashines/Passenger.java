package eu.hillel.hw14.taxidepot.datamashines;


public class Passenger extends MotorTransport {
    private int seatsNumber;
    public Passenger(int cost, int consumption, int speed, int seatsNumber) {
        super(cost, consumption, speed);
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "countSeats=" + seatsNumber +
                ", cost=" + getCost() +
                ", consumption=" + getConsumption() +
                ", speed=" + getSpeed() +
                '}';
    }
}
