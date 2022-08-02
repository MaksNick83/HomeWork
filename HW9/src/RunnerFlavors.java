import eu.hillel.hw9.flowershop.data.Bouquet;
import eu.hillel.hw9.flowershop.data.Flower;
import eu.hillel.hw9.flowershop.exception.NegativeArgumentException;
import eu.hillel.hw9.flowershop.services.ConsoleReader;
import eu.hillel.hw9.flowershop.services.FlowerShop;
import eu.hillel.hw9.flowershop.services.FlowerShopImpl;

public class RunnerFlavors {

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        String menuFlowerShop = " 1 - Create bouquet \n 2 - Bouquet operation \n 3 - Print bouquets \n 0 - Exit";
        int menuNumber;
        FlowerShop flowerShopImpl = new FlowerShopImpl();
        ConsoleReader consoleReader = new ConsoleReader();
        do {
            System.out.println(menuFlowerShop);
            menuNumber = consoleReader.getInputIntDigitsUser("");
            switch (menuNumber) {
                case 1:
                    flowerShopImpl.setBouquets(flowerShopImpl.addBouquets(flowerShopImpl.getBouquets(), consoleReader.readBouquet()));
                    break;
                case 2: {
                    operationBouquet(flowerShopImpl);
                    break;
                }
                case 3: {
                    System.out.println(flowerShopImpl);
                    break;
                }
            }
        } while (menuNumber != 0);
    }

    private static void operationBouquet(FlowerShop flowerShop) {
        Bouquet[] bouquets = flowerShop.getBouquets();

        System.out.println(flowerShop);
        boolean correctNumber = false;
        int numBouquet;
        ConsoleReader consoleReader = new ConsoleReader();
        do {
            numBouquet = consoleReader.getInputIntDigitsUser("Input number bouquet:");
            if (numBouquet < bouquets.length && numBouquet >= 0) {
                correctNumber = true;
            } else {
                System.out.println("Number Bouquet no correct.Input number:");
            }
        } while (!correctNumber);

        String menuOperationBouquet = " 1 - Cost \n 2 - Sort by fresh \n 3 - Find by stemLength  \n 0 - Return ";
        int numOperation;
        do {
            System.out.println(menuOperationBouquet);
            numOperation = consoleReader.getInputIntDigitsUser("");
            switch (numOperation) {
                case 1: {
                    System.out.println("Cost: " + flowerShop.costBouquet(bouquets[numBouquet]));
                    break;
                }
                case 2: {
                    flowerShop.sortBouquet(bouquets[numBouquet]);
                    System.out.println(bouquets[numBouquet]);
                    break;
                }
                case 3: {
                    int minFresh = consoleReader.getInputIntDigitsUser("Input min stemLength:");
                    int maxFresh = consoleReader.getInputIntDigitsUser("Input max stemLength:");
                    try {
                        Flower[] flowers = flowerShop.findFlowerByFreshnessLevel(bouquets[numBouquet], minFresh, maxFresh);
                        for (Flower flower : flowers) {
                            System.out.println(flower);
                        }
                        break;
                    } catch (NegativeArgumentException e) {
                        System.out.println("Argument negative ");
                        break;
                    }
                }
                case 0: {
                    break;
                }
            }
        }
        while (numOperation != 0);
    }

}
