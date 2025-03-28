package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {



    @GetMapping("/home")
    public String home(){
        return "home";
    }



    @PostMapping("/home")
    public String homePost(){
        return "<h1>home  post</h1>";
    }

}
