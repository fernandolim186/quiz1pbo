package edu.uph.SIAK.model;

public class mahasiswa {
    /* Nama Mahasiswa */
    String nama;
    /* Nomor induk mahasiswa */    
    String studentID;
    /* Jenis Kelamin jika 1 Wanita, 0 Pria */
    boolean jenisKelamin;
    /* Kelas */
    String kelas;
    
    public mahasiswa() {
    }

    public mahasiswa(String nama, String studentID, boolean jenisKelamin, String kelas) {
        this.nama=nama;
        this.studentID = studentID;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void kelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getKelas() {
        return this.kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t" +
            " " + getStudentID() + "\t\t" +
            " " + (isJenisKelamin()==true ? "Wanita":"Pria") + "\t\t\t" +
            " " + getKelas();
    }

    
}