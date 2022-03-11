package com.tarea3.controller;

import com.tarea3.domain.Artista;
import com.tarea3.service.ArtistaService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class indexController {
    
    @Autowired
    private ArtistaService artistaService;
    

    @GetMapping("/")
    public String Inicio(Model model) {
        
        log.info("Estamos usando una arquitectura MVC: Modelo Vista Controlador");

//        Artista artista = new Artista("Olivia", "Rodrigo", "19", "POP", "Good For You");
//        model.addAttribute(artista);
//        Artista artista2 = new Artista("Ariana", "Grande", "28", "POP", "Positions");
//        Artista artista3 = new Artista("Kanye", "West", "44", "RAP", "Praise God");
//        Artista artista4 = new Artista("Doja", "Cat", "26", "RAP", "I need to know");
//        Artista artista5 = new Artista("Dove", "Cameron", "26", "POP", "Boyfriend");

//        var artistas = Arrays.asList(artista, artista2, artista3, artista4, artista5);
//        model.addAttribute("artistas", artistas);
        
        var artistasDB = artistaService.getArtistas(); //trae todos los registros
        model.addAttribute("artistasDB",artistasDB);
        
        return "index";

    }
    
    @GetMapping("/nuevoArtista")
    public String nuevoArtista(Artista artista){
        return "modificarArtista";
    }
    
    @PostMapping("/guardarArtista")
    public String guardarArtista(Artista artista){
        artistaService.save(artista);
        return "redirect:/";
    }
    
    @GetMapping("/modificarArtista/{idartista}")
    public String modificarArtista(Artista artista, Model model){
        var respuesta = artistaService.getArtista(artista);
        model.addAttribute("artista", respuesta);
        return "modificarArtista";
    }
    
    @GetMapping("/eliminarArtista/{idartista}")
    public String eliminarArtista(Artista artista){
        artistaService.delete(artista);
        return "redirect:/";
    }
}
