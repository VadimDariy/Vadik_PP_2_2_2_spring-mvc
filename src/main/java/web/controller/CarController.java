package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServicelmpl;

import javax.sql.rowset.CachedRowSet;

@Controller
public class CarController {
    private CarServicelmpl service;
    @Autowired

    public CarController(CarServicelmpl service) {
        this.service = service;
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        model.addAttribute("cars", service.carsList(count));
        return "cars";
    }
}
