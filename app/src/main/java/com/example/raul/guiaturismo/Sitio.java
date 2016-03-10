package com.example.raul.guiaturismo;

import java.io.Serializable;

/**
 * Created by Raul on 21/02/2016.
 */
public class Sitio implements Serializable
{
    private String titulo;
    private String descripcion;
    private int idDrawable;

    public Sitio(String titulo, String descripcion, int idDrawable) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idDrawable = idDrawable;
    }
    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public int getIdDrawable() {
        return idDrawable;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}