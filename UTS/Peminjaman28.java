

public class Peminjaman28 {

    //  ATRIBUT 
    Mahasiswa28 mhs;       
    Buku28 buku;          
    int lamaPinjam;
    int batasPinjam = 5;   
    int terlambat;
    int denda;

    //  CONSTRUCTOR
    Peminjaman28(Mahasiswa28 mhs, Buku28 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); 
    }

    // METHOD HITUNG DENDA 
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;  
            denda = terlambat * 2000;                
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    // METHOD TAMPIL
    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}
