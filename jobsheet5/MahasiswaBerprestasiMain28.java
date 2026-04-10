public class MahasiswaBerprestasiMain28 {
    public static void main(String[] args) {
        MahasiswaBerprestasi28 mb = new MahasiswaBerprestasi28();

        Mahasiswa28 m1 = new Mahasiswa28("2341720001", "Ahmad", "TI-1C", 3.45);
        Mahasiswa28 m2 = new Mahasiswa28("2341720002", "Budi", "TI-1C", 3.80);
        Mahasiswa28 m3 = new Mahasiswa28("2341720003", "Citra", "TI-1C", 3.20);
        Mahasiswa28 m4 = new Mahasiswa28("2341720004", "Dina", "TI-1C", 3.95);
        Mahasiswa28 m5 = new Mahasiswa28("2341720005", "Eka", "TI-1C", 3.60);

        mb.tambah(m1);
        mb.tambah(m2);
        mb.tambah(m3);
        mb.tambah(m4);
        mb.tambah(m5);

        System.out.println("Data Mahasiswa sebelum diurutkan:");
        System.out.println("=================================");
        mb.tampil();

        mb.bubbleSort();

        System.out.println("\nData Mahasiswa setelah diurutkan berdasarkan IPK (ASC):");
        System.out.println("=================================");
        mb.tampil();
    }
}
