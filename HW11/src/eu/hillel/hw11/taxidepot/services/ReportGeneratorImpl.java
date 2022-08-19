package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.data.Freight;
import eu.hillel.hw11.taxidepot.data.Minivan;
import eu.hillel.hw11.taxidepot.data.MotorTransport;
import eu.hillel.hw11.taxidepot.data.Passenger;

public class ReportGeneratorImpl implements ReportGenerator {

    public String generateReport(MotorTransport[] motorTransports) {

        StringBuilder builder = new StringBuilder();
        for (MotorTransport motorTransport : motorTransports) {
            builder.append(getFormattedString(motorTransport));
            builder.append(System.lineSeparator());
        }
        return builder.toString().strip();
    }

    private String getFormattedString(MotorTransport motorTransport) {
        return switch (motorTransport) {
            case Minivan minivan ->
                    "Minivan," + minivan.getCost() + "," + minivan.getConsumption() + "," + minivan.getSpeed() + "," + minivan.getHeight();
            case Freight freight ->
                    "Freight," + freight.getCost() + "," + freight.getConsumption() + "," + freight.getSpeed() + "," + freight.getColor();
            case Passenger passenger ->
                    "Passenger," + passenger.getCost() + "," + passenger.getConsumption() + "," + passenger.getSpeed() + "," + passenger.getSeatsNumber();
            default -> "Unknown transport";
        };

    }

}
