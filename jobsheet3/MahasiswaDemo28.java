import java.util.Scanner;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa16[] arrMhs = new Mahasiswa16[3];
        String dummy;

        // arrMhs[0] = new Mahasiswa16();
        // arrMhs[0].nim = "244107060033";
        // arrMhs[0].nama = "AGNES TITANIA KINANTI";
        // arrMhs[0].kelas = "SIB-1E";
        // arrMhs[0].ipk = (float) 3.75;

        // arrMhs[1] = new Mahasiswa16();
        // arrMhs[1].nim = "2341720172";
        // arrMhs[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrMhs[1].kelas = "TI-2A";
        // arrMhs[1].ipk = (float) 3.36;

        // arrMhs[2] = new Mahasiswa16();
        // arrMhs[2].nim = "244107023006";
        // arrMhs[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrMhs[2].kelas = "TI-2E";
        // arrMhs[2].ipk = (float) 3.80;

        for (int i = 0; i < arrMhs.length; i++) {
            arrMhs[i] = new Mahasiswa16();
            System.out.println("Masukkin data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            arrMhs[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrMhs[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrMhs[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrMhs[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");
        }

        // System.out.println("NIM : " + arrMhs[0].nim);
        // System.out.println("Nama : " + arrMhs[0].nama);
        // System.out.println("Kelas : " + arrMhs[0].kelas);
        // System.out.println("IPK : " + arrMhs[0].ipk);
        // System.out.println("---------------------------");
        // System.out.println("NIM : " + arrMhs[1].nim);
        // System.out.println("Nama : " + arrMhs[1].nama);
        // System.out.println("Kelas : " + arrMhs[1].kelas);
        // System.out.println("IPK : " + arrMhs[1].ipk);
        // System.out.println("---------------------------");
        // System.out.println("NIM : " + arrMhs[2].nim);
        // System.out.println("Nama : " + arrMhs[2].nama);
        // System.out.println("Kelas : " + arrMhs[2].kelas);
        // System.out.println("IPK : " + arrMhs[2].ipk);
        // System.out.println("---------------------------");

        for (int i = 0; i < arrMhs.length; i++) {
            // System.out.println("Data mahasiswa ke-" + (i + 1));
            // System.out.println("NIM    : " + arrMhs[i].nim);
            // System.out.println("Nama   : " + arrMhs[i].nama);
            // System.out.println("Kelas  : " + arrMhs[i].kelas);
            // System.out.println("IPK    : " + arrMhs[i].ipk);
            // System.out.println("---------------------------");
            arrMhs[i].cetakInfo();
            System.out.println("---------------------------");
        }
    }
}