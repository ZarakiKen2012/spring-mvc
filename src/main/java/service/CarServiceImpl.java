package service;

import model.Car;

import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = Arrays.asList(
            new Car(100, "name1", 1),
            new Car(200, "name2", 2),
            new Car(300, "name3", 3),
            new Car(400, "name4", 4),
            new Car(500, "name5", 5)
    );

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
