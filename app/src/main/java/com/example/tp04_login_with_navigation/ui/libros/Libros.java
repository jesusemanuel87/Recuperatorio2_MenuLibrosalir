package com.example.tp04_login_with_navigation.ui.libros;

import java.io.Serializable;

public class Libros implements Serializable {
    private String titulo;
    private String autor;
    private String editorial;
    private int anio;

    public Libros(String titulo, String autor, String editorial, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = anio;
    }
}
