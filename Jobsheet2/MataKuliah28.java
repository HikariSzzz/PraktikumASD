public class MataKuliah28 {
    // a. Atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default
    public MataKuliah28() {
    }

    // Konstruktor Berparameter
    public MataKuliah28(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // b. Method
    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("---------------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("INFO: SKS untuk mata kuliah " + this.nama + " telah diubah menjadi " + this.sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("INFO: Jumlah jam berhasil ditambah. Jam sekarang: " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        // Cek apakah jumlah jam saat ini lebih besar atau sama dengan jam yang akan dikurangi
        if (jam <= this.jumlahJam) {
            this.jumlahJam -= jam;
            System.out.println("INFO: Pengurangan jam berhasil. Jam sekarang: " + this.jumlahJam);
        } else {
            System.out.println("GAGAL: Pengurangan jam tidak dapat dilakukan! Jumlah jam saat ini (" + this.jumlahJam + ") tidak mencukupi untuk dikurangi " + jam + ".");
        }
    }
}