package fr.wijinacademy.tests.end_2_end.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Router {

    private List<String> list = new ArrayList<>();
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("info", "Bienvenue !");
        return "home";
    }

    @GetMapping("/page1")
    public String page1(Model model) {
        model.addAttribute("info", "Formulaire d'ajout :");
        return "page1";
    }

    @GetMapping("/page2")
    public String page2(Model model) {
        model.addAttribute("info", "Liste des items :");
        model.addAttribute("list", list);
System.out.println(list);
        return "page2";
    }

    @PostMapping("/add")
    public String addAngGoToPage2(@RequestParam("item") String item, Model model) {
        model.addAttribute("info", "Page deux !");
        list.add(item);
        return "redirect:/page2";
    }

}

