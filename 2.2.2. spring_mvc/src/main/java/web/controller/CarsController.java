package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count") int count, Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 5, "К988АК"));
        cars.add(new Car("VW", 3, "К985ПК"));
        cars.add(new Car("LADA", 99, "Л388ФК"));
        cars.add(new Car("PORSCHE", 2, "К954АК"));
        cars.add(new Car("VOLGA", 1, "Е333АК"));
        cars.add(new Car("VOLGA", 2, "Е333АК"));
        cars.add(new Car("VOLGA", 2, "Е343АК"));
        cars.add(new Car("VOLGA", 3, "Е33JК"));
        model.addAttribute("cars", carService.getCars(count >= 5 ? cars.size() : count, cars));
        return "GetCars";
    }

}
