package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{id}/{name}")
    public String test(
            @PathVariable(name = "id") Integer id,
            @PathVariable(name = "name") String name) {
        System.out.println(name + ":" + id);
        return "home";
    }


    @GetMapping
    public String each(Model model) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        model.addAttribute("lists", list);
        return "eachtest";
    }


}
