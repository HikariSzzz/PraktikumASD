
public class Buku28 {

    // ATRIBUT
    String kodeBuku;
    String judul;
    int tahunTerbit;

    // CONSTRUCTOR
    Buku28(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    //  METHOD TAMPIL DATA
    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
