
import java.util.Objects;

abstract class TaxiDepot {
    int cost;
    int consumption;
    int speed;

    public TaxiDepot(int cost, int consumption, int speed) {
        this.cost = cost;
        this.consumption = consumption;
        this.speed = speed;
    }

}