package eu.hillel.hw11.taxidepot.services;


import eu.hillel.hw11.taxidepot.data.Freight;
import eu.hillel.hw11.taxidepot.data.Minivan;
import eu.hillel.hw11.taxidepot.data.MotorTransport;
import eu.hillel.hw11.taxidepot.data.Passenger;


public class TaxiDepotImpl implements TaxiDepot {
    private MotorTransport[] motorTransports;

    public TaxiDepotImpl(MotorTransport[] motorTransports) {
        this.motorTransports = motorTransports;
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
