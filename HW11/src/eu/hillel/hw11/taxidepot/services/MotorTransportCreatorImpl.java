package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.data.Freight;
import eu.hillel.hw11.taxidepot.data.Minivan;
import eu.hillel.hw11.taxidepot.data.MotorTransport;
import eu.hillel.hw11.taxidepot.data.Passenger;

public class MotorTransportCreatorImpl implements MotorTransportCreator {
    @Override
    public MotorTransport[] createWithFile(String dataFile) {
        String[] lineFile = dataFile.split(System.lineSeparator());
        MotorTransport[] motorTransports = new MotorTransport[lineFile.length];
        for (int i = 0; i < lineFile.length; i++) {
            motorTransports[i] = createMotorTransport(lineFile[i]);
        }
        return motorTransports;
    }

    private MotorTransport createMotorTransport(String s) {
        String[] lineFileTransport = s.split(",");
        if (lineFileTransport[0].equals("Freight")) {
            return new Freight(Integer.parseInt(lineFileTransport[1]), Integer.parseInt(lineFileTransport[2]), Integer.parseInt(lineFileTransport[3]), lineFileTransport[4]);
        } else if (lineFileTransport[0].equals("Minivan")) {
            return new Minivan(Integer.parseInt(lineFileTransport[1]), Integer.parseInt(lineFileTransport[2]), Integer.parseInt(lineFileTransport[3]), Integer.parseInt(lineFileTransport[3]));
        } else if (lineFileTransport[0].equals("Passenger")) {
            return new Passenger(Integer.parseInt(lineFileTransport[1]), Integer.parseInt(lineFileTransport[2]), Integer.parseInt(lineFileTransport[3]), Integer.parseInt(lineFileTransport[3]));
        }
        return null;
    }
}
