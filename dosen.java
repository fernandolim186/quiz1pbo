package edu.uph.SIAK.model;

public class dosen {
    /* Nama Dosen */
    String nama;
    /* Nomor induk dosen */    
    String dosenID;
    /* Jenis Kelamin jika 1 Wanita, 0 Pria */
    boolean jenisKelamin;
    
    public dosen() {
    }

    public dosen(String nama, String dosenID, boolean jenisKelamin) {
        this.nama=nama;
        this.dosenID = dosenID;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getdosenID() {
        return this.dosenID;
    }

    public void setdosenID(String dosenID) {
        this.dosenID = dosenID;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t" +
            " " + getdosenID() + "\t\t" +
            " " + (isJenisKelamin()==true ? "Wanita":"Pria");
    }

}