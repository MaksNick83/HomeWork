
class CarProcessor {
    private Car[] cars;

    public CarProcessor(Car[] cars) {
        this.cars = cars;
    }

    public CarProcessor() {
        this.cars = new Car[]{};
    }

    public void setCars(Car[] cars) {
        this.cars = cars;

    }

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

    void listCarsBrand(String brand) {
        if (cars.length == 0) {
            System.out.println("Empty Car");
        } else {
            listCarsBrand(brand, cars);
        }
    }

    void listCarsBrandForMoreYears(String model, int operationYear) {
        if (cars.length == 0) {
            System.out.println("Empty Car");
        } else {
            listCarsBrandForMoreYears(model, operationYear, cars);
        }
    }

    void listCarsYearManufactureWitchPrice(int yearOfIssue, double price) {
        if (cars.length == 0) {
            System.out.println("Empty Car");
        } else {
            listCarsYearManufactureWitchPrice(yearOfIssue, price, cars);
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
