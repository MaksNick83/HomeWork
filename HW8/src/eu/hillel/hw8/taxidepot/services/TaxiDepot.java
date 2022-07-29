package eu.hillel.hw8.taxidepot.services;


import eu.hillel.hw8.taxidepot.datamashines.MotorTransport;

public interface TaxiDepot {

    int totalCost();

    void sortByConsumption();

    MotorTransport[] findBySpeed(int minSpeed, int maxSpeed);

    void printTaxiDepots(MotorTransport[] motorTransports);
}
