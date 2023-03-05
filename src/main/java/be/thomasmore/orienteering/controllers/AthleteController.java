package be.thomasmore.orienteering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AthleteController {
    @GetMapping({"/athlete"})
    public String athlete(){
        return "athlete";
    }
}
