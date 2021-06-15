package edu.uph.SIAK.model;

import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    dosen Dosen;
    matakuliah Matakuliah;
    ruangan Ruangan;
    
    //ruangan


    public jadwalkuliah() {
    }


    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, dosen Dosen, matakuliah Matakuliah, ruangan Ruangan) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
        this.Ruangan = Ruangan;
    }


    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public void setDosen(dosen Dosen) {
        this.Dosen = Dosen;
    }

    public dosen getDosen() {
        return this.Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    public void setRuangan(ruangan Ruangan) {
        this.Ruangan = Ruangan;
    }

    public ruangan getrRuangan() {
        return this.Ruangan;
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("Jadwal Kuliah \n");
        System.out.println("Nama Matakuliah : ");
        System.out.println(Matakuliah.toString());
        System.out.println("");

        System.out.println("Dosen \n");
        System.out.println("Nama \t\t\t DosenID \t\t Jenis Kelamin");
        System.out.println("==============================================================");
        System.out.println(Dosen.toString());
        System.out.println("");
    
        System.out.println("Ruangan \n");
        System.out.println(Ruangan.toString());
        System.out.println("");

        System.out.println("Daftar Mahasiswa \n");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin \t\t Kelas");
        System.out.println("==============================================================================");
        for(mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
    }


    @Override
    public String toString() {
        return "{" +
            " Mahasiswa='" + getMahasiswa() + "'" +
            ", Dosen='" + getDosen() + "'" +
            ", Matakuliah='" + getMatakuliah() ;
    }
}