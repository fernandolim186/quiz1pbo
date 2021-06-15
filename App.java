import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.matakuliah;
import edu.uph.SIAK.model.ruangan;
import edu.uph.SIAK.model.dosen;

public class App {
    public static void main(String[] args) throws Exception {
        matakuliah mt1 = new matakuliah("Pemrograman berorientasi objek");

        dosen ds1 = new dosen("Ade Maulana", "01234567910",false);

        ruangan ruang = new ruangan("Microsoft teams");

        mahasiswa mhs1 = new mahasiswa("Calvin", "03082200010",false,"20TI2");
        mahasiswa mhs2 = new mahasiswa("Sri", "03082200011",true,"20TI2");
        mahasiswa mhs3 = new mahasiswa("Elvia", "03082200012",true,"20TI2");

        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.setMatakuliah(mt1);
        JadwalKuliah.setDosen(ds1);
        JadwalKuliah.setRuangan(ruang);
        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}