
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

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && getClass() != object.getClass()) {
            return false;
        }
        Freight freight = (Freight) object;

        return (freight.color != null && freight.color.equals(color))
                && freight.cost == cost
                && freight.consumption == consumption
                && freight.speed == speed;
    }

    @Override
    public int hashCode() {

        int result = color == null ? 0 : color.hashCode();
        result = 31 * result + cost;
        result = 31 * result + consumption;
        result = 31 * result + speed;

        return result;


    }

}
