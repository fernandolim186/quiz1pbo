package edu.uph.SIAK.model;

public class matakuliah {
    /* Nama pelajaran */
    String mataPelajaran;
    String hari;
    String jam;
    String sampai;
    

    public matakuliah(String hari,String mataPelajaran,String jam,String sampai) {
        this.hari = hari;
        this.mataPelajaran = mataPelajaran;
        this.jam = jam;
        this.sampai = sampai;
    }

    public String getMataPelajaran() {
        return this.mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String getHari() {
        return this.hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return this.jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getSampai() {
        return this.sampai;
    }

    public void setSampai(String sampai) {
        this.sampai = sampai;
    }
    
    @Override
    public String toString() {
        return "" +
            " Hari           : " + getHari() + "\n" +
            " Mata pelajaran : " + getMataPelajaran() + "\n" +
            " Jam            : " + getJam() + "\n" +
            " Sampai         : " + getSampai();
    }
   

    
}