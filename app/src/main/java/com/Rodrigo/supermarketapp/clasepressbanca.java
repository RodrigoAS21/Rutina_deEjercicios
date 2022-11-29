package com.Rodrigo.supermarketapp;

public class clasepressbanca {
    private String press_banca;
    private String Npressbanca;
    private int imagencuatro;

    public clasepressbanca(String press_banca, String npressbanca, int imagencuatro) {
        this.press_banca = press_banca;
        Npressbanca = npressbanca;
        this.imagencuatro = imagencuatro;
    }

    public String getPress_banca() {
        return press_banca;
    }

    public void setPress_banca(String press_banca) {
        this.press_banca = press_banca;
    }

    public String getNpressbanca() {
        return Npressbanca;
    }

    public void setNpressbanca(String npressbanca) {
        Npressbanca = npressbanca;
    }

    public int getImagencuatro() {
        return imagencuatro;
    }

    public void setImagencuatro(int imagencuatro) {
        this.imagencuatro = imagencuatro;
    }
}
