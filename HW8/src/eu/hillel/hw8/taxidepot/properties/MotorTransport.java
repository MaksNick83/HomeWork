package eu.hillel.hw8.taxidepot.properties;


public abstract class MotorTransport {
     int cost;
     int consumption;
     int speed;

    public MotorTransport(int cost, int consumption, int speed) {
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