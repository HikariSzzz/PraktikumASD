package Jobsheet9;

public class Mahasiswa28 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa28() {
    }

    public Mahasiswa28(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
