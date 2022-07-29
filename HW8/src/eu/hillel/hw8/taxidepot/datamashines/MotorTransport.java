package eu.hillel.hw8.taxidepot.datamashines;


public abstract class MotorTransport {
    private int cost;
    private int consumption;
    private int speed;

    protected MotorTransport(int cost, int consumption, int speed) {
        this.cost = cost;
        this.consumption = consumption;
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getSpeed() {
        return speed;
    }
}