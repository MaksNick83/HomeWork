package eu.hillel.hw8.taxidepot.functional;


import eu.hillel.hw8.taxidepot.properties.MotorTransport;

public interface TaxiDepot {

    int totalCost();

    void sortByConsumption();

    MotorTransport[] findBySpeed(int minSpeed, int maxSpeed);

    void printTaxiDepots(MotorTransport[] motorTransports);
}
