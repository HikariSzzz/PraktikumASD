 import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf = "";
        String keterangan = "";
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextDouble();
        
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextDouble();
        
        System.out.println("==============================");
        
        // cek validasi
        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {
            
            System.out.println("nilai tidak valid");
        } 
        else {
            
            // hitung nilai akhir
            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            
            // menentukan nilai huruf
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            }
            else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            }
            else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            }
            else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            }
            else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            }
            else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            }
            else {
                nilaiHuruf = "E";
            }
            
            // menentukan lulus atau tidak
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
                nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
                nilaiHuruf.equals("C")) {
                
                keterangan = "LULUS";
            } else {
                keterangan = "TIDAK LULUS";
            }
            
            // output
            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA " + keterangan);
        }
        
        input.close();
    }
}
