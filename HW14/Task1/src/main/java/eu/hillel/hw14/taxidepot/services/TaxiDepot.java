package eu.hillel.hw14.taxidepot.services;


import eu.hillel.hw14.taxidepot.datamashines.MotorTransport;

import java.util.List;

public interface TaxiDepot {

    int totalCost();

    void sortByConsumption();

    List<MotorTransport> findBySpeed(int minSpeed, int maxSpeed);

}
