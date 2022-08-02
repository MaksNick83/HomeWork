package eu.hillel.hw9.flowershop.services;

import eu.hillel.hw9.flowershop.data.Accessory;
import eu.hillel.hw9.flowershop.data.Bouquet;
import eu.hillel.hw9.flowershop.data.Flower;

import java.util.Scanner;

public class ConsoleReader {

    public Bouquet readBouquet() {
        String menuCreateBouquet = " 1 - Create flower \n 2 - Create accessory \n 0 - Return";
        Bouquet bouquet = new Bouquet();
        int menuNumber;
        do {
            System.out.println(menuCreateBouquet);
            menuNumber = getInputIntDigitsUser("");
            switch (menuNumber) {
                case 1: {
                    bouquet.setFlowers(bouquet.addFlowers(bouquet.getFlowers(), readFlower()));
                    break;
                }
                case 2: {
                    bouquet.setAccessories(bouquet.addAccessory(bouquet.getAccessories(), readAccessory()));
                    break;
                }

            }
        } while (menuNumber != 0);
        return bouquet;
    }

    public Accessory readAccessory() {
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = getInputIntDigitsUser("Input price: ");
        Accessory accessory = new Accessory(name, price);
        return accessory;
    }

    public Flower readFlower() {
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int price = getInputIntDigitsUser("Input price: ");
        int freshnessLevel = getInputIntDigitsUser("Input freshnessLevel: ");
        int stemLength = getInputIntDigitsUser("Input stemLength: ");
        Flower flower = new Flower(name, price, freshnessLevel, stemLength);
        return flower;
    }


    public int getInputIntDigitsUser(String messageUser) {
        boolean inputDigits = false;
        int a = 0;
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            if (!messageUser.equals("")) {
                System.out.print(messageUser);
            }

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                inputDigits = true;

            } else {
                System.out.println("Is not digit.Repeat");
            }
        }
        return a;
    }


}
