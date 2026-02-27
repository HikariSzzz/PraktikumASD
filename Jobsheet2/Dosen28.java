public class Dosen28 {
    // a. Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Dosen28() {
    }

    // Konstruktor Berparameter
    public Dosen28(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // b. Method
    public void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        // Mengubah boolean menjadi String Aktif/Tidak Aktif agar lebih mudah dibaca
        System.out.println("Status          : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("---------------------------------");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("INFO: Status dosen " + this.nama + " telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - this.tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("INFO: Bidang keahlian " + this.nama + " telah diubah menjadi: " + this.bidangKeahlian);
    }
}