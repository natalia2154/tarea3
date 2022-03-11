package com.tarea3.service;

import com.tarea3.domain.Artista;
import java.util.List;

/**
 *
 * @author calde
 */
public interface ArtistaService {
    
    public List<Artista> getArtistas();
    
    public void save(Artista artista);
    
    public void delete(Artista artista);
    
    public Artista getArtista(Artista artista);
    
}
