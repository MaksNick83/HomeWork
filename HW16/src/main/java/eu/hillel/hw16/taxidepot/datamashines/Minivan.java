package eu.hillel.hw16.taxidepot.datamashines;


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
