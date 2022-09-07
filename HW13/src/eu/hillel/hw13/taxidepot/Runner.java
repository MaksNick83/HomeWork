package eu.hillel.hw13.taxidepot;

import eu.hillel.hw13.taxidepot.datamashines.Freight;
import eu.hillel.hw13.taxidepot.datamashines.Minivan;
import eu.hillel.hw13.taxidepot.datamashines.MotorTransport;
import eu.hillel.hw13.taxidepot.datamashines.Passenger;
import eu.hillel.hw13.taxidepot.services.TaxiDepot;
import eu.hillel.hw13.taxidepot.services.TaxiDepotNumberImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Freight freight1 = new Freight(1000, 15, 100, "Black");
        Minivan minivan1 = new Minivan(500, 10, 120, 100);
        Passenger passenger1 = new Passenger(7000, 7, 170, 5);
        MotorTransport[] motorTransports = {freight1, minivan1, passenger1};


        TaxiDepot taxiDepot = new TaxiDepotNumberImpl(motorTransports);
        System.out.println("Taxi depot:");
        taxiDepot.printTaxiDepots(motorTransports);
        System.out.println(taxiDepot.totalCost());
        //taxiDepot.sortByConsumptionInterface();
        //taxiDepot.sortByConsumptionLambda();
        taxiDepot.sortByConsumptionMetod();

        System.out.println("Taxi depot sort by Consumption :");
        //taxiDepot.sortByConsumption();
        taxiDepot.printTaxiDepots(motorTransports);
        System.out.println("Taxi depot find  Speed :");
        taxiDepot.printTaxiDepots(taxiDepot.findBySpeed(100, 130));
    }

}
