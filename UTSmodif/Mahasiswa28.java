public class Mahasiswa28 {

    //  ATRIBUT
    String nim;
    String nama;
    String prodi;

    //  CONSTRUCTOR 
    Mahasiswa28(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    //  METHOD TAMPIL DATA 
    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
