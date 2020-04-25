package zadanie_1;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static void main(String[] args) {
        showTwoCars();
        System.out.println();
        showCarList();
    }

    private static void showCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", "F60"));
        cars.add(new Car("Ford", "Mondeo"));
        for (Car car: cars) {
            System.out.println(car.description());
        }
    }

    private static void showTwoCars() {
        Car car1 = new Car("Ferrari", "F60");
        Car car2 = new Car("Ford", "Mondeo");
        System.out.println(car1.description());
        System.out.println(car2.description());
    }
}
