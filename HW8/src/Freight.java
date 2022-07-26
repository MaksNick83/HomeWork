
public class Freight extends TaxiDepot {
    private String color;

    public Freight(int cost, int consumption, int speed, String color) {
        super(cost, consumption, speed);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Freight{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", consumption=" + consumption +
                ", speed=" + speed +
                '}';
    }

}
