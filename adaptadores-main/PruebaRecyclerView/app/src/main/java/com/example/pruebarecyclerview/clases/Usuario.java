package com.example.pruebarecyclerview.clases;

public class Usuario {
    private String imagen;
    private String nombre;
    private String curso;

    public Usuario(String imagen, String nombre, String curso) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
