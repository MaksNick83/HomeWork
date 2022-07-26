package com.nikitchyn.homework8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxiDepotOperationTest {
    TaxiDepotOperation taxiDepotOperation;

    @BeforeEach
    public void setUp() {
        Freight freight1 = new Freight(1000, 100, 10, "Black");
        Minivan minivan1 = new Minivan(500, 50, 5, 100);
        Passenger passenger1 = new Passenger(7000, 150, 15, 5);
        TaxiDepot[] taxiDepots = {freight1, minivan1, passenger1};
        taxiDepotOperation = new TaxiDepotOperation(taxiDepots);
    }

    @Test
    void totalCost() {
        double result = taxiDepotOperation.totalCost();
        Assertions.assertEquals(8500, result);
    }

    @Test
    void sortByConsumption() {
        taxiDepotOperation.sortByConsumption();
        Freight freight1 = new Freight(1000, 100, 10, "Black");
        Minivan minivan1 = new Minivan(500, 50, 5, 100);
        Passenger passenger1 = new Passenger(7000, 150, 15, 5);
        TaxiDepot[] taxiDepotsSort = new TaxiDepot[]{minivan1, freight1, passenger1};
        Assertions.assertArrayEquals(taxiDepotsSort, taxiDepotOperation.getTaxiDepots());
    }

    @Test
    void findBySpeed() {
        TaxiDepot[] taxiDepots = taxiDepotOperation.findBySpeed(4, 11);
        Freight freight1 = new Freight(1000, 100, 10, "Black");
        Minivan minivan1 = new Minivan(500, 50, 5, 100);
        TaxiDepot[] taxiDepotsSort = new TaxiDepot[]{freight1, minivan1};
        Assertions.assertArrayEquals(taxiDepotsSort, taxiDepots);


    }
}