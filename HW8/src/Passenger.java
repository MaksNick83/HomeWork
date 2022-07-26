package com.nikitchyn.homework8;

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


    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && getClass() != object.getClass()) {
            return false;
        }
        Passenger passenger = (Passenger) object;

        return (passenger.seatsNumber == seatsNumber)
                && passenger.cost == cost
                && passenger.consumption == consumption
                && passenger.speed == speed;
    }

    @Override
    public int hashCode() {

        int result = seatsNumber;
        result = 31 * result + cost;
        result = 31 * result + consumption;
        result = 31 * result + speed;

        return result;


    }

}
