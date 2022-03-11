package com.tarea3.service;

import com.tarea3.dao.ArtistaDao;
import com.tarea3.domain.Artista;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author calde
 */
@Service
public class ArtistaServiceImpl implements ArtistaService {
    
    @Autowired //crea instancias automatico
    private ArtistaDao artistaDao;

    @Override
    @Transactional (readOnly = true) //lectura
    public List<Artista> getArtistas() {
        return (List<Artista>) artistaDao.findAll();
    }

    @Override
    @Transactional //Manejo transacciones de escritura y lectura
    public void save(Artista artista) {
        artistaDao.save(artista);       
    }

    @Override
    @Transactional
    public void delete(Artista artista) {
        artistaDao.delete(artista);
    }

    @Override
    @Transactional (readOnly = true)
    public Artista getArtista(Artista artista) {
        return artistaDao.findById(artista.getIdartista()).orElse(null);
    }  
    
}
