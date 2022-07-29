package eu.hillel.hw8.taxidepot.services;


import eu.hillel.hw8.taxidepot.datamashines.MotorTransport;
import eu.hillel.hw8.taxidepot.datamashines.Freight;
import eu.hillel.hw8.taxidepot.datamashines.Minivan;
import eu.hillel.hw8.taxidepot.datamashines.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxiDepotNumberOneTest {

    TaxiDepotNumberOne taxiDepotNumberOne;

    @BeforeEach
    public void setUp() {
        Freight freight1 = new Freight(1000, 100, 10, "Black");
        Minivan minivan1 = new Minivan(500, 50, 5, 100);
        Passenger passenger1 = new Passenger(7000, 150, 15, 5);
        MotorTransport[] motorTransports = {freight1, minivan1, passenger1};
        taxiDepotNumberOne = new TaxiDepotNumberOne(motorTransports);
    }

    @Test
    void totalCost() {
        int result = taxiDepotNumberOne.totalCost();
        Assertions.assertEquals(8500, result);
    }

    @Test
    void sortByConsumption() {
        taxiDepotNumberOne.sortByConsumption();
        MotorTransport[] motorTransportForSort = taxiDepotNumberOne.getTaxiDepots();
        boolean sort = true;
        for (int i = 1; i < motorTransportForSort.length; i++) {
            if (motorTransportForSort[i].getConsumption() < motorTransportForSort[i - 1].getConsumption()) {
                sort = false;
                break;
            }
        }
        Assertions.assertTrue(sort);
    }

    @Test
    void findBySpeed() {
        int minSpeed = 4;
        int maxSpeed = 11;
        MotorTransport[] motorTransports = taxiDepotNumberOne.findBySpeed(minSpeed, maxSpeed);
        boolean result = true;
        for (MotorTransport motorTransport : motorTransports) {
            if (motorTransport.getSpeed() < minSpeed || motorTransport.getSpeed() > maxSpeed) {
                result = false;
                break;
            }
        }
        Assertions.assertTrue(result);
    }
}