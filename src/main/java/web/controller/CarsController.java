package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;

@Controller
public class CarsController {

    private final CarServiceIml carServiceIml;

    public CarsController(CarServiceIml carServiceIml) {
        this.carServiceIml = carServiceIml;
    }


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) String count, Model model) {
        model.addAttribute("head", "List cars:");
        model.addAttribute("car", carServiceIml.getCarList(count));
        return "cars";
    }
}
