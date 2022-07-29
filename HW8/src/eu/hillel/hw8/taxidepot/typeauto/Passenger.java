package eu.hillel.hw8.taxidepot.typeauto;


import eu.hillel.hw8.taxidepot.properties.MotorTransport;

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
