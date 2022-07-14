public class Runner {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "x1", 1999, "black", 1000, "AM1111");
        Car car2 = new Car("BMW", "x2", 2000, "black", 2000, "AM1112");
        Car car3 = new Car("BMW", "x3", 2001, "black", 3000, "AM1113");
        Car car4 = new Car("BMW", "x3", 2020, "black", 3000, "AM1114");
        Car car5 = new Car("BMW", "x4", 2002, "black", 4000, "AM1115");
        Car car6 = new Car("BMW", "x5", 2003, "black", 5000, "AM1116");
        Car car7 = new Car("Volvo", "xc70", 2000, "black", 6000, "AM1117");
        Car[] cars = {car1, car2, car3, car4, car5, car6, car7};
        CarProcessor processor = new CarProcessor();

        String brand = "BMW";
        System.out.println("---list of cars of a given " + brand + "---");
        processor.listCarsBrand(brand, cars);

        String model = "x3";
        int operationYear = 1;
        System.out.println("---list of cars of a given " + model + " that have been in operation for more than " + operationYear + " years---");
        processor.listCarsBrandForMoreYears(model, operationYear, cars);

        int yearOfIssue = 2001;
        double price = 2000;
        System.out.println("---list of cars of a given " + yearOfIssue + " , the price of which is higher than the specified " + price + ". ---");
        processor.listCarsYearManufactureWitchPrice(yearOfIssue, price, cars);

    }
}
