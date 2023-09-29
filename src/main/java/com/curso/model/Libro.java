package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa un libro con un ISBN, un título y una temática.
 */
@Entity
@Table(name = "libros")
public class Libro {
    
    /** El ISBN del libro */
    @Id
    private int isbn;
    
    /** El título del libro */
    private String titulo;
    
    /** La temática del libro */
    private String tematica;

    /**
     * Constructor por defecto.
     * Inicializa un nuevo objeto Libro sin ISBN, título ni temática.
     */
    public Libro() {
        super();
    }

    /**
     * Constructor que inicializa el libro con un ISBN específico.
     *
     * @param isbn el ISBN del libro.
     */
    public Libro(int isbn) {
        super();
        this.isbn = isbn;
    }

    /**
     * Constructor que inicializa el libro con un ISBN, título y temática específicos.
     *
     * @param isbn el ISBN del libro.
     * @param titulo el título del libro.
     * @param tematica la temática del libro.
     */
    public Libro(int isbn, String titulo, String tematica) {
        super();
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    /**
     * Obtiene el ISBN del libro.
     *
     * @return el ISBN del libro.
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * Establece el ISBN del libro.
     *
     * @param isbn el nuevo ISBN del libro.
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return el título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo el nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la temática del libro.
     *
     * @return la temática del libro.
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * Establece la temática del libro.
     *
     * @param tematica la nueva temática del libro.
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    /**
     * Proporciona una representación en cadena de caracteres del libro.
     *
     * @return una cadena de caracteres que representa el libro.
     */
    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
    }

    /**
     * Calcula el hashCode para un objeto Libro.
     *
     * @return un valor hashcode para este objeto.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + isbn;
        return result;
    }

    /**
     * Compara este libro con el objeto especificado.
     *
     * @param obj el objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn != other.isbn)
            return false;
        return true;
    }
}
