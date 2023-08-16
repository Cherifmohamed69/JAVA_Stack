package com.example.Dojo_and_Ninjas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Dojo_and_Ninjas.Modells.Dojo;

@Controller
@RequestMapping("/dojos")
public class DojoController {
    
    @GetMapping("/newDojo")
    public String newDojoForm(Model model) {
        model.addAttribute("dojo", new Dojo());
        return "new_dojo";
    }
    
    @PostMapping
    public String createDojo(@ModelAttribute Dojo dojo) {
        return "redirect:/dojos/" + dojo.getId();
    }
    
    @GetMapping("/{id}")
    public String showDojo(@PathVariable Long id, Model model) {
        model.addAttribute("dojo", showDojo(null, null));
        return "show_dojo";
    }
}
