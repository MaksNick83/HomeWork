package eu.hillel.hw8.taxidepot;

import eu.hillel.hw8.taxidepot.functional.TaxiDepot;
import eu.hillel.hw8.taxidepot.functional.TaxiDepotNumberOne;
import eu.hillel.hw8.taxidepot.properties.MotorTransport;
import eu.hillel.hw8.taxidepot.typeauto.Freight;
import eu.hillel.hw8.taxidepot.typeauto.Minivan;
import eu.hillel.hw8.taxidepot.typeauto.Passenger;

public class Runner {
    public static void main(String[] args) {
        Freight freight1 = new Freight(1000, 15, 100, "Black");
        Minivan minivan1 = new Minivan(500, 10, 120, 100);
        Passenger passenger1 = new Passenger(7000, 7, 170, 5);
        MotorTransport[] motorTransports = {freight1, minivan1, passenger1};
        TaxiDepot taxiDepotNumberOne = new TaxiDepotNumberOne(motorTransports);
        System.out.println("Taxi depot:");
        taxiDepotNumberOne.printTaxiDepots(motorTransports);
        System.out.println(taxiDepotNumberOne.totalCost());
        System.out.println("Taxi depot sort by Consumption :");
        taxiDepotNumberOne.sortByConsumption();
        taxiDepotNumberOne.printTaxiDepots(motorTransports);
        System.out.println("Taxi depot find  Speed :");
        taxiDepotNumberOne.printTaxiDepots(taxiDepotNumberOne.findBySpeed(100, 130));
    }

}
