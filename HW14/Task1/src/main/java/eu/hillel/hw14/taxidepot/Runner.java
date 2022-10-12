package eu.hillel.hw14.taxidepot;

import eu.hillel.hw14.taxidepot.datamashines.Freight;
import eu.hillel.hw14.taxidepot.datamashines.Minivan;
import eu.hillel.hw14.taxidepot.datamashines.MotorTransport;
import eu.hillel.hw14.taxidepot.datamashines.Passenger;
import eu.hillel.hw14.taxidepot.services.TaxiDepot;
import eu.hillel.hw14.taxidepot.services.TaxiDepotImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Freight freight1 = new Freight(1000, 15, 100, "Black");
        Minivan minivan1 = new Minivan(500, 10, 120, 100);
        Passenger passenger1 = new Passenger(7000, 7, 170, 5);
        MotorTransport[] motorTransports = {freight1, minivan1, passenger1};
        ArrayList<MotorTransport> motorTransportList = new ArrayList<>(Arrays.asList(motorTransports));
        TaxiDepot taxiDepot = new TaxiDepotImpl(motorTransportList);
        System.out.println("Taxi depot:");
        System.out.println(taxiDepot);
        System.out.println(taxiDepot.totalCost());
        System.out.println("Taxi depot sort by Consumption :");
        taxiDepot.sortByConsumption();
        System.out.println(taxiDepot);
        System.out.println("Taxi depot find  Speed :");
        System.out.println(taxiDepot.findBySpeed(100, 130));
    }

}
