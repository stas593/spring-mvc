package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{

    private List<Car> cars;

    public CarDaoImpl(){
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 5, "К988АК"));
        cars.add(new Car("VW", 3, "К985ПК"));
        cars.add(new Car("LADA", 99, "Л388ФК"));
        cars.add(new Car("PORSCHE", 2, "К954АК"));
        cars.add(new Car("VOLGA", 1, "Е333АК"));
    }

    @Override
    public List<Car> getCars(int count) {
        return this.cars.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return this.cars;
    }
}
