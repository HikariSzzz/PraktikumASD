public class DosenMain28 {
    public static void main(String[] args) {
        // Asumsi tahun sekarang adalah 2026 untuk method hitungMasaKerja
        int tahunSekarang = 2026;

        // 1. Menggunakan Konstruktor Default
        System.out.println("=== Obyek 1 (Konstruktor Default) ===");
        Dosen28 dosen1 = new Dosen28();
        dosen1.idDosen = "DSN001";
        dosen1.nama = "Prof. Yan Watequlis Syaifudin";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja Dosen: " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun");
        dosen1.ubahKeahlian("Machine Learning");
        System.out.println();

        // 2. Menggunakan Konstruktor Berparameter
        System.out.println("=== Obyek 2 (Konstruktor Berparameter) ===");
        Dosen28 dosen2 = new Dosen28("DSN002", "Candra Bella Visto, M.T.", false, 2018, "Rekayasa Perangkat Lunak");
        
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja Dosen: " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun");
        dosen2.ubahKeahlian("Manajemen Proyek Perangkat Lunak");
    }
}