package eu.hillel.hw9.flowershop.data;

public class Accessory {
    private String name;
    private int price;

    public Accessory(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' + ", price=" + price + '}';
    }
}
