package com.example.jokeapp.controller;

import com.example.jokeapp.service.JokeServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JokeController {

    @Autowired
    JokeServiceProvider jokeServiceProvider;

    @GetMapping("/jokes")
    public String getJokes(Model model, @RequestParam(required = false, defaultValue = "5")  String jokesNumber){
        int jNumber = Integer.parseInt(jokesNumber);
        System.out.println("jNumber = " + jNumber);
        List<String> jokeList = jokeServiceProvider.getJoke(jNumber);
        model.addAttribute("jokes", jokeList);
        return "jokes";
    }
}
