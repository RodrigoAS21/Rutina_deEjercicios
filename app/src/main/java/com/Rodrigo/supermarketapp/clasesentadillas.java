package com.Rodrigo.supermarketapp;

public class clasesentadillas {
    private String sentadillas;
    private String repsentadillas;
    private int imagentres;

    public clasesentadillas(String sentadillas, String repsentadillas, int imagentres) {
        this.sentadillas = sentadillas;
        this.repsentadillas = repsentadillas;
        this.imagentres = imagentres;
    }


    public String getSentadillas() {
        return sentadillas;
    }

    public void setSentadillas(String sentadillas) {
        this.sentadillas = sentadillas;
    }

    public String getRepsentadillas() {
        return repsentadillas;
    }

    public void setRepsentadillas(String repsentadillas) {
        this.repsentadillas = repsentadillas;
    }

    public int getImagentres() {
        return imagentres;
    }

    public void setImagentres(int imagentres) {
        this.imagentres = imagentres;
    }
}
