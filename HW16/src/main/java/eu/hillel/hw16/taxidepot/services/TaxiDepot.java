package eu.hillel.hw16.taxidepot.services;


import eu.hillel.hw16.taxidepot.datamashines.MotorTransport;

import java.util.List;

public interface TaxiDepot {


    int totalCost();

    void sortByConsumption();

    List<MotorTransport> findBySpeed(int minSpeed, int maxSpeed);

}
