package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars?count={id}")
    public String getCars(@RequestParam(name = "count") int count, Model model){
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

    @GetMapping(value = "/cars")
    public String geAlltCars(Model model){
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }


}
