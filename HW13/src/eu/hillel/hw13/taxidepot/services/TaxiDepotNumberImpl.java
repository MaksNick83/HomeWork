package eu.hillel.hw13.taxidepot.services;


import eu.hillel.hw13.taxidepot.datamashines.MotorTransport;

import java.util.Arrays;
import java.util.Comparator;

public class TaxiDepotNumberImpl implements TaxiDepot {
    private MotorTransport[] motorTransports;

    public TaxiDepotNumberImpl(MotorTransport[] motorTransports) {
        this.motorTransports = motorTransports;
    }

    public TaxiDepotNumberImpl() {
        this.motorTransports = new MotorTransport[]{};
    }

    public MotorTransport[] getTaxiDepots() {
        return motorTransports;
    }

    public int totalCost() {
        int cost = 0;
        for (MotorTransport motorTransport : motorTransports) {
            cost += motorTransport.getCost();

        }
        return cost;
    }

    public void sortByConsumption() {

        for (int i = motorTransports.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (motorTransports[j].getConsumption() > motorTransports[j + 1].getConsumption()) {
                    MotorTransport k = motorTransports[j];
                    motorTransports[j] = motorTransports[j + 1];
                    motorTransports[j + 1] = k;
                }
            }
        }

    }

    public void sortByConsumptionInterface() {
        Arrays.sort(motorTransports, consumptionComparator);
    }

    public void sortByConsumptionLambda() {
        Arrays.sort(motorTransports, consumptionComparatorLambda);
    }

    public void sortByConsumptionMetod() {
        Arrays.sort(motorTransports, TaxiDepotNumberImpl::compareByConsumption);
    }

    public static int compareByConsumption(MotorTransport o1, MotorTransport o2) {
        return o1.getConsumption() - o2.getConsumption();
    }

    public static Comparator<MotorTransport> consumptionComparator = new Comparator<MotorTransport>() {
        @Override
        public int compare(MotorTransport o1, MotorTransport o2) {
            return o1.getConsumption() - o2.getConsumption();
        }
    };
    public static Comparator<MotorTransport> consumptionComparatorLambda = (o1, o2) -> o1.getConsumption() - o2.getConsumption();


    public void printTaxiDepots(MotorTransport[] motorTransports) {
        for (MotorTransport motorTransport : motorTransports) {
            System.out.println(motorTransport);
        }
    }

    public MotorTransport[] findBySpeed(int minSpeed, int maxSpeed) {
        MotorTransport[] newMotorTransports = new MotorTransport[]{};
        for (MotorTransport motorTransport : motorTransports) {
            if (motorTransport.getSpeed() > minSpeed && motorTransport.getSpeed() < maxSpeed) {
                newMotorTransports = addTaxi(newMotorTransports, motorTransport);
            }
        }
        return newMotorTransports;
    }

    private MotorTransport[] addTaxi(MotorTransport[] newMotorTransports, MotorTransport newMotorTransport) {
        int countTaxiDepots = newMotorTransports.length + 1;
        MotorTransport[] addMotorTransports = new MotorTransport[newMotorTransports.length + 1];
        for (int i = 0; i < countTaxiDepots - 1; i++) {
            addMotorTransports[i] = newMotorTransports[i];
        }
        addMotorTransports[countTaxiDepots - 1] = newMotorTransport;

        return addMotorTransports;
    }


}
