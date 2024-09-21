package humber.finalspringsecuritydb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String landing(){
        return "This is Landing Page";
    }
    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is Admin Page";
    }

    @GetMapping("/user")
    public String user(){
        return "This is User Page";
    }
}
