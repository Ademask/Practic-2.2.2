package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Kia", "Korea"));
        cars.add(new Car(2, "Hyundai", "Korea"));
        cars.add(new Car(3, "Kia", "Korea"));
        cars.add(new Car(4, "Hyundai", "Korea"));
        cars.add(new Car(5, "Kia", "Korea"));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
