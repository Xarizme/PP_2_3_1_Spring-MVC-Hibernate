package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	@GetMapping(value = "/car")
	public String printSumLeghtWord(ModelMap model) {
		List<Car> carList = new ArrayList<>();
		carList.add(new Car("BMW", "X5", 2019));
		carList.add(new Car("Mercedes", "C-class", 2018));
		carList.add(new Car("Audi", "A8", 2017));
		model.addAttribute("carList", carList);
		return "carList";
	}
	
}