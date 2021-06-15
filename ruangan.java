package edu.uph.SIAK.model;

public class ruangan {
    /* Nama ruangan */
    String Ruangan;


    public ruangan(String Ruangan) {
        this.Ruangan = Ruangan;
    }

    public String getRuangan() {
        return this.Ruangan;
    }

    public void setRuangan(String Ruangan) {
        this.Ruangan = Ruangan;
    }


    @Override
    public String toString() {
        return "" +
            " Ruangan = " + getRuangan();
    }
    
}