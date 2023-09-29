package com.curso.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibrosService;
/*
 * Indicamos que es un controlador REST
 */
@RestController
public class LibrosController {

    /*
     * Usamos la anotación @Autowired para inyectar el objeto LibrosService
     */
    @Autowired
    LibrosService librosService;

    /*
     * Obtiene todos los libros
     * 
     * Partimos de la anotación @GetMapping con el endpoint /libros y
     * con produces = MediaType.APPLICATION_JSON_VALUE nos devuelve un JSON
     */
    @GetMapping(value="libro", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> listarLibros() {
        return librosService.listarLibros();
    }

    /*
     * Obtiene un libro por su ISBN
     * 
     * Partimos de la anotación @PostMapping con el endpoint /libros y
     * con consumes = MediaType.APPLICATION_JSON_VALUE nos devuelve un JSON
     * Con @RequestBody recibe un objeto Libro en el cuerpo de la petición
     */
    @PostMapping(value="libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crearLibro(@RequestBody Libro libro) {
        librosService.crearLibro(libro);       
    }

    /*
     * Actualiza un libro
     * 
     * Partimos de la anotación @PutMapping con el endpoint /libros y
     * con consumes = MediaType.APPLICATION_JSON_VALUE nos devuelve un JSON
     * Con @RequestBody recibe un objeto Libro en el cuerpo de la petición
     */
    @PutMapping(value="libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarLibro(@RequestBody Libro libro){
        librosService.actualizarLibro(libro);
    }

    /*
     * Elimina un libro por su ISBN y devuelve todos los libros
     * 
     * Partimos de la anotación @DeleteMapping con el endpoint /libros/{isbn} y
     * con produces = MediaType.APPLICATION_JSON_VALUE nos devuelve un JSON
     * 
     * Con @PathVariable recibe el ISBN del libro
     */
    @DeleteMapping(value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> eliminarLibros(@PathVariable ("isbn") int isbn ){
       return librosService.eliminarLibro(isbn);  
    }

    

    
}
