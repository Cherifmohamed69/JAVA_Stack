package com.example.Dojo_and_Ninjas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Dojo_and_Ninjas.Modells.Ninja;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
    
    @GetMapping("/newNinja")
    public String newNinjaForm(Model model) {
       return "new_ninja.jsp";
    }
    
    @PostMapping
    public String createNinja(@ModelAttribute Ninja ninja) {
        return "redirect:/dojos/" + ninja.getDojo().getId();
    }
}
