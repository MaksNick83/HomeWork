package eu.hillel.hw9.flowershop.data;

import eu.hillel.hw9.flowershop.exception.NegativeArgumentException;

public class Bouquet {
    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet() {
        this.flowers = new Flower[]{};
        this.accessories = new Accessory[]{};
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }

    public int getCostBouquet() {
        int cost = 0;
        for (Flower flower : flowers) {
            cost = cost + flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            cost = cost + accessory.getPrice();
        }
        return cost;
    }

    public void sortBouquetByFlowers() {
        for (int i = flowers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (flowers[j].getFreshnessLevel() > flowers[j + 1].getFreshnessLevel()) {
                    Flower k = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = k;
                }
            }
        }
    }

    public Flower[] findFlowerByFreshnessLevel(int min, int max) {

        Flower[] flowersFind = new Flower[]{};
        for (Flower flower : flowers) {
            if (flower.getStemLength() > min && flower.getStemLength() < max) {
                flowersFind = addFlowers(flowersFind, flower);
            }
        }
        return flowersFind;
    }

    public Flower[] addFlowers(Flower[] flowersNew, Flower flower) {
        int countFlowers = flowersNew.length + 1;
        Flower[] addFlowers = new Flower[countFlowers];
        for (int i = 0; i < countFlowers - 1; i++) {
            addFlowers[i] = flowersNew[i];
        }
        addFlowers[countFlowers - 1] = flower;
        return addFlowers;
    }

    public Accessory[] addAccessory(Accessory[] accessories, Accessory makeAccessory) {

        int countAccessories = accessories.length + 1;
        Accessory[] addAccessories = new Accessory[countAccessories];

        for (int i = 0; i < countAccessories - 1; i++) {
            addAccessories[i] = accessories[i];
        }
        addAccessories[countAccessories - 1] = makeAccessory;
        return addAccessories;
    }


    @Override
    public String toString() {
        String outBouquet = "Flowers:\n";

        for (Flower flower : flowers) {
            outBouquet = outBouquet + flower.toString() + "\n";

        }
        outBouquet = outBouquet + "Accessory:\n";
        for (Accessory accessory : accessories) {
            outBouquet = outBouquet + accessory.toString() + "\n";
        }

        return outBouquet;
    }
}
