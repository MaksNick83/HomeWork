package eu.hillel.hw9.flowershop.data;

public class Flower {
    private String name;
    private int price;
    private int freshnessLevel;
    private int stemLength;

    public Flower(String name, int price, int freshnessLevel, int stemLength) {
        this.name = name;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' + ", price=" + price + ", freshnessLevel=" + freshnessLevel + ", stemLength=" + stemLength + '}';
    }
}
