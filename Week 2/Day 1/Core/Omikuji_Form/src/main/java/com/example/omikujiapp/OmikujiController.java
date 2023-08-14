package com.example.omikujiapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {

    @GetMapping("/omikuji")
    public String showOmikujiForm(Model model) {
        return "omikuji-form";
    }

    @PostMapping("/omikuji/process")
    public String processOmikujiForm(@RequestParam String question, HttpSession session) {
        session.setAttribute("question", question);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune(Model model, HttpSession session) {
        String question = (String) session.getAttribute("question");
        String fortune = generateRandomFortune();
        model.addAttribute("question", question);
        model.addAttribute("fortune", fortune);
        return "fortune";
    }

    private String generateRandomFortune() {
        // Implement the logic to generate a random fortune here
        return "Your fortune text goes here.";
    }
}
