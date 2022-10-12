package eu.hillel.hw16.taxidepot.datamashines;


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
