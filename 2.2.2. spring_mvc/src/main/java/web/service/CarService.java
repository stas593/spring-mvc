package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    public List<Car> getCars(int count, List<Car> cars){
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
