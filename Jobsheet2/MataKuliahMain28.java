public class MataKuliahMain28 {
    public static void main(String[] args) {
        // 1. Menggunakan Konstruktor Default
        System.out.println("=== Obyek 1 (Konstruktor Default) ===");
        MataKuliah28 mk1 = new MataKuliah28();
        mk1.kodeMK = "ALSD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        // Tes kondisi gagal pada kurangiJam
        mk1.kurangiJam(10); 
        System.out.println();

        // 2. Menggunakan Konstruktor Berparameter
        System.out.println("=== Obyek 2 (Konstruktor Berparameter) ===");
        MataKuliah28 mk2 = new MataKuliah28("BD02", "Basis Data", 2, 4);
        
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
    }
}