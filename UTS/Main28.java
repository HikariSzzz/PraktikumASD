

import java.util.Scanner; 

public class Main28 {
    public static void main(String[] args) {

        //  Array objek Mahasiswa 
        Mahasiswa28[] dataMhs = new Mahasiswa28[3];
        dataMhs[0] = new Mahasiswa28("22001", "Andi", "Teknik Informatika");
        dataMhs[1] = new Mahasiswa28("22002", "Budi", "Teknik Informatika");
        dataMhs[2] = new Mahasiswa28("22003", "Citra", "Sistem Informasi Bisnis");

        //  Array objek Buku 
        Buku28[] dataBuku = new Buku28[4];
        dataBuku[0] = new Buku28("B001", "Algoritma", 2020);
        dataBuku[1] = new Buku28("B002", "Basis Data", 2019);
        dataBuku[2] = new Buku28("B003", "Pemrograman", 2021);
        dataBuku[3] = new Buku28("B004", "Fisika", 2024);

        //  Array objek Peminjaman  
        Peminjaman28[] dataPinjam = new Peminjaman28[5];
        dataPinjam[0] = new Peminjaman28(dataMhs[0], dataBuku[0], 7);
        dataPinjam[1] = new Peminjaman28(dataMhs[1], dataBuku[1], 3);
        dataPinjam[2] = new Peminjaman28(dataMhs[2], dataBuku[2], 10);
        dataPinjam[3] = new Peminjaman28(dataMhs[2], dataBuku[3], 6);
        dataPinjam[4] = new Peminjaman28(dataMhs[0], dataBuku[1], 4);

        Scanner sc = new Scanner(System.in);
        int pilih;

        //Menu utama
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM ");
            System.out.println("6. Kategori Denda");
            System.out.println("7. Cari Berdasarkan Judul Buku");
            System.out.println("8. Total lama Peminjaman Per Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println();

            // BAGIAN 1: TAMPIL DATA
            if (pilih == 1) {
                System.out.println("Daftar Mahasiswa");
                for (int i = 0; i < dataMhs.length; i++) {
                    dataMhs[i].tampilMahasiswa();
                }
            } else if (pilih == 2) {
                System.out.println("Daftar Buku");
                for (int i = 0; i < dataBuku.length; i++) {
                    dataBuku[i].tampilBuku();
                }
            } else if (pilih == 3) {
                System.out.println("Data Peminjaman");
                for (int i = 0; i < dataPinjam.length; i++) {
                    dataPinjam[i].tampilPeminjaman();
                }

            // BAGIAN 2: SORTING
            } else if (pilih == 4) {
                System.out.println("Urutan Denda Terbesar");
                // Selection Sort - urutkan denda dari terbesar
                for (int i = 0; i < dataPinjam.length - 1; i++) {
                    int maxIdx = i;
                    for (int j = i + 1; j < dataPinjam.length; j++) {
                        if (dataPinjam[j].denda > dataPinjam[maxIdx].denda) {
                            maxIdx = j;
                        }
                    }
                    Peminjaman28 temp = dataPinjam[i];
                    dataPinjam[i] = dataPinjam[maxIdx];
                    dataPinjam[maxIdx] = temp;
                }
                System.out.println("(Denda terbesar):");
                for (int i = 0; i < dataPinjam.length; i++) {
                    dataPinjam[i].tampilPeminjaman();
                }

            //  BAGIAN 3: SEARCHING 
            } else if (pilih == 5) {
                System.out.println("Cari Berdasarkan NIM");
                System.out.print("Masukkan NIM: ");
                String cariNim = sc.next();
                //cari berdasarkan NIM
                boolean ditemukan = false;
                for (int i = 0; i < dataPinjam.length; i++) {
                    if (dataPinjam[i].mhs.nim.equals(cariNim)) {
                        dataPinjam[i].tampilPeminjaman();
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Data peminjaman dengan NIM " + cariNim + " tidak ditemukan.");
                }
            } else if (pilih == 6){

            }
            System.out.println();
        } while (pilih != 0);
    }
}
