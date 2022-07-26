
public class TaxiDepotOperation {
    private TaxiDepot[] taxiDepots;

    public TaxiDepotOperation(TaxiDepot[] taxiDepots) {
        this.taxiDepots = taxiDepots;
    }

    public TaxiDepotOperation() {
        this.taxiDepots = new TaxiDepot[]{};
    }

    public double totalCost() {
        double cost = 0;
        for (TaxiDepot taxiDepot : taxiDepots) {
            cost += taxiDepot.cost;

        }
        return cost;
    }

    public TaxiDepot[] sortByConsumption() {

        for (int i = taxiDepots.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (taxiDepots[j].consumption > taxiDepots[j + 1].consumption) {
                    TaxiDepot k = taxiDepots[j];
                    taxiDepots[j] = taxiDepots[j + 1];
                    taxiDepots[j + 1] = k;
                }
            }
        }
        return taxiDepots;
    }

    public void printTaxiDepots(TaxiDepot[] taxiDepots) {
        for (TaxiDepot taxiDepot : taxiDepots) {
            System.out.println(taxiDepot);
        }
    }

    TaxiDepot[] findBySpeed(int minSpeed, int maxSpeed) {
        TaxiDepot[] newTaxiDepots = new TaxiDepot[]{};
        for (TaxiDepot taxiDepot : taxiDepots) {
            if (taxiDepot.speed > minSpeed && taxiDepot.speed < maxSpeed) {
                newTaxiDepots = addTaxi(newTaxiDepots, taxiDepot);

            }
        }
        return newTaxiDepots;
    }

    private TaxiDepot[] addTaxi(TaxiDepot[] newTaxiDepots, TaxiDepot newTaxiDepot) {
        int countTaxiDepots = newTaxiDepots.length + 1;
        TaxiDepot[] addTaxiDepots = new TaxiDepot[newTaxiDepots.length + 1];
        for (int i = 0; i < countTaxiDepots - 1; i++) {
            addTaxiDepots[i] = newTaxiDepots[i];
        }
        addTaxiDepots[countTaxiDepots - 1] = newTaxiDepot;

        return addTaxiDepots;
    }


}
