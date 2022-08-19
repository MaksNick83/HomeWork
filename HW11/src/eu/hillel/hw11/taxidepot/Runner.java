package eu.hillel.hw11.taxidepot;


import eu.hillel.hw11.taxidepot.data.MotorTransport;
import eu.hillel.hw11.taxidepot.services.*;

public class Runner {
    public static void main(String[] args) {
        String fileIn = "HW11/resources/carsIn.txt";
        String fileOut = "HW11/resources/carsOut.txt";
        FileReader fileReader = new FileReaderImpl();
        FileWriter fileWriter = new FileWriterImpl();
        ReportGenerator reportGenerator = new ReportGeneratorImpl();
        MotorTransportCreator motorTransportCreator = new MotorTransportCreatorImpl();
        MotorTransport[] motorTransports = motorTransportCreator.createWithFile(fileReader.read(fileIn));
        TaxiDepot taxiDepotNumberOne = new TaxiDepotImpl(motorTransports);
        System.out.println("Taxi depot:");
        taxiDepotNumberOne.printTaxiDepots(motorTransports);
        System.out.println(taxiDepotNumberOne.totalCost());
        System.out.println("Taxi depot sort by Consumption :");
        taxiDepotNumberOne.sortByConsumption();
        taxiDepotNumberOne.printTaxiDepots(motorTransports);
        System.out.println("Taxi depot find  Speed :");
        taxiDepotNumberOne.printTaxiDepots(taxiDepotNumberOne.findBySpeed(100, 130));
        fileWriter.write(reportGenerator.generateReport(motorTransports), fileOut);
    }

}
