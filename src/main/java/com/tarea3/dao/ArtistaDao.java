/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea3.dao;

import com.tarea3.domain.Artista;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author calde
 */
public interface ArtistaDao extends CrudRepository<Artista, Long> {
    
}
