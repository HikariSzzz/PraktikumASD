

public class Peminjaman28 {

    //  ATRIBUT 
    Mahasiswa28 mhs;       
    Buku28 buku;          
    int lamaPinjam;
    int batasPinjam = 5;   
    int terlambat;
    int denda;
    // modifikasi A2
    String kategoriBenda;

    //  CONSTRUCTOR
    Peminjaman28(Mahasiswa28 mhs, Buku28 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    //  METHOD HITUNG DENDA 
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;  
            denda = terlambat * 2000;                
        } else {
            terlambat = 0;
            denda = 0;
        }
        // modifikasi A2
        if (denda <= 5000) {
            kategoriBenda = "Ringan";
        } else if (denda <= 10000) {
            kategoriBenda = "Sedang";
        } else {
            kategoriBenda = "Berat";
        }
    }

    // modifikasi A2
    // METHOD TAMPIL
    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda + " | Kategori: " + kategoriBenda);
    }
}
