package com.curso.service;

import java.util.List;

import com.curso.model.Libro;
/**
 * Servicio para realizar operaciones CRUD en objetos Libro
 */
public interface LibrosService {

    //Mostrar los libros
    List<Libro> listarLibros();
    //Crear un libro
    void crearLibro(Libro libro);
    //Actualizar un libro
    void actualizarLibro(Libro libro);
    //Eliminar un libro por su isbn
    List<Libro> eliminarLibro(int isbn);
    //Buscar un libro por su isbn
    Libro buscaLibro(int isbn);
    
}
