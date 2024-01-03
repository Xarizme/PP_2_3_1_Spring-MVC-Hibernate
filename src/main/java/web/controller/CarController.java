package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/car")
    public String printCars(@RequestParam (value = "count", required = false, defaultValue = "5") int count,
                            ModelMap model) {
        System.out.println("count = " + count);
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "carList";

    }
}
