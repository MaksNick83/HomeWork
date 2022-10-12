package eu.hillel.hw16.taxidepot.services;

import eu.hillel.hw16.taxidepot.datamashines.MotorTransport;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiDepotImpl implements TaxiDepot {
    private List<MotorTransport> motorTransports;

    public TaxiDepotImpl(List<MotorTransport> motorTransports) {
        this.motorTransports = motorTransports;
    }

    public List<MotorTransport> getTaxiDepots() {
        return motorTransports;
    }

    @Override
    public int totalCost() {
        return motorTransports.stream()
                .mapToInt(MotorTransport::getCost)
                .sum();
    }

    @Override
    public void sortByConsumption() {
        motorTransports = motorTransports.stream()
                .sorted(Comparator.comparingInt(MotorTransport::getConsumption))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return motorTransports.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));

    }

    @Override
    public List<MotorTransport> findBySpeed(int minSpeed, int maxSpeed) {
        return motorTransports.stream()
                .filter(motorTransport -> motorTransport.getSpeed() > minSpeed && motorTransport.getSpeed() < maxSpeed)
                .collect(Collectors.toList());
    }

}
