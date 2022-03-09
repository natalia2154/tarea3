package com.tarea3.controller;

import com.tarea3.domain.Artista;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class indexController {

    @RequestMapping("/")
    public String Inicio(Model model) {

        Artista artista = new Artista("Olivia", "Rodrigo", "19", "POP", "Good For You");
        model.addAttribute(artista);
        Artista artista2 = new Artista("Ariana", "Grande", "28", "POP", "Positions");
        Artista artista3 = new Artista("Kanye", "West", "44", "RAP", "Praise God");
        Artista artista4 = new Artista("Doja", "Cat", "26", "RAP", "I need to know");
        Artista artista5 = new Artista("Dove", "Cameron", "26", "POP", "Boyfriend");

        var artistas = Arrays.asList(artista, artista2, artista3, artista4, artista5);
        model.addAttribute("artistas", artistas);
        return "index";

    }

}
