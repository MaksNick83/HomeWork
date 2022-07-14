class CarProcessor {

    void listCarsBrand(String brand, Car[] cars) {
        for (Car car : cars) {
            if (brand.equals(car.brand)) {
                printInfoCar(car);
            }
        }
    }

    void listCarsBrandForMoreYears(String model, int operationYear, Car[] cars) {
        int currentYear = 2022;
        for (Car car : cars) {
            if (model.equals(car.model) && currentYear - car.yearOfIssue > operationYear) {
                printInfoCar(car);
            }
        }
    }

    void listCarsYearManufactureWitchPrice(int yearOfIssue, double price, Car[] cars) {
        for (Car car : cars) {
            if (yearOfIssue == car.yearOfIssue && car.price > price) {
                printInfoCar(car);
            }
        }
    }

    void printInfoCar(Car car) {
        System.out.println("Car{" +
                "brand='" + car.brand + '\'' +
                ", model='" + car.model + '\'' +
                ", yearOfIssue=" + car.yearOfIssue +
                ", color='" + car.color + '\'' +
                ", price=" + car.price +
                ", registrationNumber='" + car.registrationNumber + '\'' +
                '}');
    }

}
