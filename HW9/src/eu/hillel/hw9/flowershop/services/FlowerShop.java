package eu.hillel.hw9.flowershop.services;

import eu.hillel.hw9.flowershop.data.Bouquet;
import eu.hillel.hw9.flowershop.data.Flower;
import eu.hillel.hw9.flowershop.exception.NegativeArgumentException;

public interface FlowerShop {

    int costBouquet(Bouquet bouquet);

    void sortBouquet(Bouquet bouquet);

    Flower[] findFlowerByFreshnessLevel(Bouquet bouquet, int min, int max) throws NegativeArgumentException;

    Bouquet[] addBouquets(Bouquet[] bouquets, Bouquet makeBouquet);

    void setBouquets(Bouquet[] bouquets);

    Bouquet[] getBouquets();


}
