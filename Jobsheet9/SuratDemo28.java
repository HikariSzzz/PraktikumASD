package Jobsheet9;

import java.util.Scanner;

public class SuratDemo28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kapasitas stack surat: ");
        int kapasitas = scan.nextInt();
        scan.nextLine(); // clear buffer
        
        StackSurat28 stackSurat = new StackSurat28(kapasitas);
        int menu;

        do {
            System.out.println("\nMenu Pengelolaan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin (Berdasarkan Nama Mahasiswa)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (menu) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); // clear buffer
                    
                    Surat28 suratBaru = new Surat28(id, nama, kelas, jenis, durasi);
                    stackSurat.push(suratBaru);
                    System.out.println("Surat berhasil diterima!");
                    break;
                case 2:
                    Surat28 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("\nMemproses Surat:");
                        System.out.println("ID Surat: " + diproses.idSurat);
                        System.out.println("Nama Mahasiswa: " + diproses.namaMahasiswa);
                        System.out.println("Surat telah diverifikasi dan diproses (dikeluarkan dari antrean).");
                    }
                    break;
                case 3:
                    Surat28 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("\nSurat Izin Terakhir (Paling Atas):");
                        System.out.println("ID Surat: " + terakhir.idSurat);
                        System.out.println("Nama Mahasiswa: " + terakhir.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 5);

        scan.close();
    }
}
