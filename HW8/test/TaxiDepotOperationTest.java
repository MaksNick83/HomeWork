
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
        int result = taxiDepotOperation.totalCost();
        Assertions.assertEquals(8500, result);
    }

    @Test
    void sortByConsumption() {
        taxiDepotOperation.sortByConsumption();
        TaxiDepot[] taxiDepotForSort = taxiDepotOperation.getTaxiDepots();
        boolean sort = true;
        for (int i = 1; i < taxiDepotForSort.length; i++) {
            if (taxiDepotForSort[i].consumption < taxiDepotForSort[i - 1].consumption) {
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
        TaxiDepot[] taxiDepots = taxiDepotOperation.findBySpeed(minSpeed, maxSpeed);
        boolean result = true;
        for (TaxiDepot taxiDepot : taxiDepots) {
            if (taxiDepot.speed < minSpeed || taxiDepot.speed > maxSpeed) {
                result = false;
                break;
            }
        }
        Assertions.assertTrue(result);
    }
}