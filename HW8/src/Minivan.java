package com.nikitchyn.homework8;

import java.util.Objects;

public class Minivan extends TaxiDepot {
    private int height;

    public Minivan(int cost, int consumption, int speed, int height) {
        super(cost, consumption, speed);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "height=" + height +
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
        Minivan minivan = (Minivan) object;
        return minivan.height == height
                && minivan.cost == cost
                && minivan.consumption == consumption
                && minivan.speed == speed;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + cost;
        result = 31 * result + consumption;
        result = 31 * result + speed;

        return result;


    }


}
