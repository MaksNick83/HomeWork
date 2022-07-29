package eu.hillel.hw8.taxidepot.typeauto;


import eu.hillel.hw8.taxidepot.properties.MotorTransport;

public class Minivan extends MotorTransport {
    private int height;

    public Minivan(int cost, int consumption, int speed, int height) {
        super(cost, consumption, speed);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "height=" + height +
                ", cost=" + getCost() +
                ", consumption=" + getConsumption() +
                ", speed=" + getSpeed() +
                '}';
    }

}
