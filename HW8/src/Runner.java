
public class Runner {
    public static void main(String[] args) {
        Freight freight1 = new Freight(1000, 100, 10, "Black");
        Minivan minivan1 = new Minivan(500, 50, 5, 100);
        Passenger passenger1 = new Passenger(7000, 150, 15, 5);
        TaxiDepot[] taxiDepots = {freight1, minivan1, passenger1};
        TaxiDepotOperation taxiDepotOperation = new TaxiDepotOperation(taxiDepots);
        System.out.println("Taxi depot:");
        taxiDepotOperation.printTaxiDepots(taxiDepots);
        System.out.println(taxiDepotOperation.totalCost());
        System.out.println("Taxi depot sort by Consumption :");
        taxiDepotOperation.sortByConsumption();
        taxiDepotOperation.printTaxiDepots(taxiDepots);
        System.out.println("Taxi depot find  Speed :");
        taxiDepotOperation.printTaxiDepots(taxiDepotOperation.findBySpeed(4, 11));
    }

}
