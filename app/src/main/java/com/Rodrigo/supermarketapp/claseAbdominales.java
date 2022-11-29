package com.Rodrigo.supermarketapp;

public class claseAbdominales {
    private String abdominal;
    private String repeticion;
    private int imagen;

    public claseAbdominales(String abdominal, String repeticion, int imagen) {
        this.abdominal = abdominal;
        this.repeticion = repeticion;
        this.imagen = imagen;
    }

    public String getAbdominal() {
        return abdominal;
    }

    public void setAbdominal(String abdominal) {
        this.abdominal = abdominal;
    }

    public String getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(String repeticion) {
        this.repeticion = repeticion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
