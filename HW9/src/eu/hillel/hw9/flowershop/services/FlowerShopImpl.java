package eu.hillel.hw9.flowershop.services;

import eu.hillel.hw9.flowershop.data.Bouquet;
import eu.hillel.hw9.flowershop.data.Flower;
import eu.hillel.hw9.flowershop.exception.NegativeArgumentException;

public class FlowerShopImpl implements FlowerShop {
    private Bouquet[] bouquets;

    public FlowerShopImpl() {
        this.bouquets = new Bouquet[]{};
    }

    public void setBouquets(Bouquet[] bouquets) {
        this.bouquets = bouquets;
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

    @Override
    public int costBouquet(Bouquet bouquet) {

        return bouquet.getCostBouquet();
    }

    @Override
    public void sortBouquet(Bouquet bouquet) {
        bouquet.sortBouquetByFlowers();
    }

    @Override
    public Flower[] findFlowerByFreshnessLevel(Bouquet bouquet, int min, int max) throws NegativeArgumentException {
        if (min < 0 || max < 0) {
            throw new NegativeArgumentException("Argument negative Min:" + min + "Max:" + max);
        }
        return bouquet.findFlowerByFreshnessLevel(min, max);
    }

    @Override
    public String toString() {
        String stringBouquet = "Bouquets:\n";

        for (int i = 0; i < bouquets.length; i++) {
            stringBouquet = stringBouquet + i + " -bouquet\n " + bouquets[i].toString();
        }
        return stringBouquet;
    }

    public Bouquet[] addBouquets(Bouquet[] bouquets, Bouquet makeBouquet) {

        int countBouquets = bouquets.length + 1;
        Bouquet[] addBouquets = new Bouquet[countBouquets];

        for (int i = 0; i < countBouquets - 1; i++) {
            addBouquets[i] = bouquets[i];
        }
        addBouquets[countBouquets - 1] = makeBouquet;
        return addBouquets;

    }

}
