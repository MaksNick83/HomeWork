package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.data.MotorTransport;

public interface MotorTransportCreator {
    MotorTransport[] createWithFile(String dataFile);
}
