package eu.hillel.hw11.taxidepot.services;


import eu.hillel.hw11.taxidepot.data.MotorTransport;

public interface TaxiDepot {

    int totalCost();

    void sortByConsumption();

    MotorTransport[] findBySpeed(int minSpeed, int maxSpeed);

    void printTaxiDepots(MotorTransport[] motorTransports);

}
