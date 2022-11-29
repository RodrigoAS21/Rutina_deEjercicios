package com.Rodrigo.supermarketapp;

public class claseflexiones {
    private String flexion;
    private String repetionflex;
    private int imagendos;


    public claseflexiones(String flexiones, String repetionesflex, int image) {
        this.flexion = flexion;
        this.repetionflex = repetionflex;
        this.imagendos = image;
    }


    public String getFlexiones() {
        return flexion;
    }

    public void setFlexiones(String flexiones) {
        this.flexion = flexiones;
    }

    public String getRepetionesflex() {
        return repetionflex;
    }

    public void setRepetionesflex(String repetionesflex) {
        this.repetionflex = repetionesflex;
    }

    public int getImage() {
        return imagendos;
    }

    public void setImage(int image) {
        this.imagendos = image;
    }
}
