package com.maxwel.catalogo.service;

import java.util.List;

import com.maxwel.catalogo.model.Musica;

public interface CatalogoService {
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);    
    void delete(long id);    
}