package eu.hillel.hw13.taxidepot.services;


import eu.hillel.hw13.taxidepot.datamashines.MotorTransport;

public interface TaxiDepot {

    int totalCost();

    void sortByConsumption();

    void sortByConsumptionInterface();
    void sortByConsumptionMetod();

    void sortByConsumptionLambda();

    MotorTransport[] findBySpeed(int minSpeed, int maxSpeed);

    void printTaxiDepots(MotorTransport[] motorTransports);
}
