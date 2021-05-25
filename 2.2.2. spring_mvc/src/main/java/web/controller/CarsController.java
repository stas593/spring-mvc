package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count" , required=false) Integer count, Model model){
        model.addAttribute("cars", count != null ? carService.getCars(count) : carService.getAllCars());
        return "cars";
    }
}
