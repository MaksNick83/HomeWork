
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

}
