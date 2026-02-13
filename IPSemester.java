import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        int jumlahMK = namaMK.length;
        
        double[] nilaiAngka = new double[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];
        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};
        
        double total = 0;
        int totalSKS = 0;
        
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        
        // input nilai
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            
            // konversi nilai setara
            if (nilaiAngka[i] > 80) {
                nilaiSetara[i] = 4;
            }
            else if (nilaiAngka[i] > 73) {
                nilaiSetara[i] = 3.5;
            }
            else if (nilaiAngka[i] > 65) {
                nilaiSetara[i] = 3;
            }
            else if (nilaiAngka[i] > 60) {
                nilaiSetara[i] = 2.5;
            }
            else if (nilaiAngka[i] > 50) {
                nilaiSetara[i] = 2;
            }
            else if (nilaiAngka[i] > 39) {
                nilaiSetara[i] = 1;
            }
            else {
                nilaiSetara[i] = 0;
            }
            
            total += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        
        double ip = total / totalSKS;
        
        System.out.println("===============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        
        System.out.println("MK\t\t\t\tNilai Angka\tSKS\tNilai Setara");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(namaMK[i] + "\t\t" + nilaiAngka[i] + "\t\t" + sks[i] + "\t" + nilaiSetara[i]);
        }
        
        System.out.println("===============================");
        System.out.println("IP Semester = " + ip);
        
        input.close();
    }
}
