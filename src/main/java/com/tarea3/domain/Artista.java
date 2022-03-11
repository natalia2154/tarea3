package com.tarea3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="artista")
public class Artista implements Serializable{
    
    private static final long serialVersionUIL = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idartista;
    private String nombre;
    private String edad;
    private String generoMusical;
    private String cancionPopular;

    
    public Artista(){
        
    }
    
    public Artista(String nombre, String edad, String cancionPopular, String generoMusical) {
        this.nombre = nombre;
        this.edad = edad;
        this.cancionPopular = cancionPopular;
        this.generoMusical = generoMusical;

    }

    

}
