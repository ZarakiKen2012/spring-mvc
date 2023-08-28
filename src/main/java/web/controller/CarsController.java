package web.controller;


import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

@Controller
public class CarsController {
    private CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        if (count > 5) {
            count = 5;
        }
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
