package com.tarea3.domain;

import lombok.Data;

@Data
public class Artista {

    private String nombre;
    private String apellidos;
    private String edad;
    private String generoMusical;
    private String cancionPopular;

    
    public Artista(){
        
    }
    
    public Artista(String nombre, String apellidos, String edad, String generoMusical, String cancionPopular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.generoMusical = generoMusical;
        this.cancionPopular = cancionPopular;
    }

    

}
