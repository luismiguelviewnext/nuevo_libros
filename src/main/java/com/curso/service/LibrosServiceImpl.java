package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibrosDao;
import com.curso.model.Libro;
/*
 * Indicamos que la clase es un servicio que implementa la interfaz LibrosService
 */
@Service
public class LibrosServiceImpl implements LibrosService {

    /*
     * Usamos la anotación @Autowired para inyectar el objeto LibrosDao
     */ 
    @Autowired
    private LibrosDao librosDao;

    /*
     * Implementamos el método listarlibros que usa findAll() 
     */

    @Override
    public List<Libro> listarLibros() {
        return librosDao.findAll();
    }

    /*
     * Implementamos el método crearLibro que usa save()
     */
    @Override
    public void crearLibro(Libro libro) {
        
        librosDao.save(libro);
    }

    /**
     * Implementamos el método actualizarLibro que usa save()
     */
    @Override
    public void actualizarLibro(Libro libro) {
       
        librosDao.save(libro);
    }
    /**
     * Implementamos el método eliminarLibro que usa deleteById()
     */
    @Override
    public List<Libro> eliminarLibro(int isbn) {
        librosDao.deleteById(isbn);
        return librosDao.findAll();
    }

    /**
     * Implementamos el método buscaLibro que usa findById() y orElse(null) por si no encuentra
     * un libro con ese ISBN que devuelva null
     */
    @Override
    public Libro buscaLibro(int isbn) {
        return librosDao.findById(isbn).orElse(null);
        
    }
    
}
