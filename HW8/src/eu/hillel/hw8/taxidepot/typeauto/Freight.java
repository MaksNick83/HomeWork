package eu.hillel.hw8.taxidepot.typeauto;


import eu.hillel.hw8.taxidepot.properties.MotorTransport;

public class Freight extends MotorTransport {
    private String color;

    public Freight(int cost, int consumption, int speed, String color) {
        super(cost, consumption, speed);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Freight{" +
                "color='" + color + '\'' +
                ", cost=" + getCost() +
                ", consumption=" + getConsumption() +
                ", speed=" + getSpeed() +
                '}';
    }

}
