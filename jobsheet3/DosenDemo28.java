import java.util.Scanner;

public class DosenDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen28 arrDosen[] = new Dosen28[3];

        for (int i = 0; i < arrDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kd = sc.nextLine();
            System.out.print("Nama: ");
            String nm = sc.nextLine();
            System.out.print("Jenis kelamin (p/w): ");
            char jk = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Usia: ");
            String dummy = sc.nextLine();
            int usia = Integer.parseInt(dummy);

            do {
                if (jk == 'p' || jk == 'P') {
                    arrDosen[i] = new Dosen28(kd, nm, true, usia);
                    System.out.println("---------------------------");
                    break;
                } else if (jk == 'w' || jk == 'W') {
                    arrDosen[i] = new Dosen28(kd, nm, false, usia);
                    System.out.println("---------------------------");
                    break;
                } else {
                    System.out.println("Jenis Kelamin tidak valid!");
                    System.out.println("---------------------------");
                    System.out.print("Jenis kelamin (p/w): ");
                    jk = sc.next().charAt(0);
                }
            } while (true);

        }

        System.out.println();

        // int x = 1;
        // for (Dosen16 dosen16 : arrDosen) {
        // System.out.println("Data Dosen ke-" + (x++));
        // System.out.println("Kode: " + dosen16.kode);
        // System.out.println("Nama: " + dosen16.nama);
        // System.out.println("Jenis Kelamin: " + (dosen16.jenisKelamin ? "Pria" :
        // "Wanita"));
        // System.out.println("Usia: " + dosen16.usia);
        // System.out.println("---------------------------");
        // }

        System.out.println("---------------------------");
        DataDosen28 dataDosen28 = new DataDosen28();
        dataDosen28.dataSemuaDosen(arrDosen);
        dataDosen28.jumlahDosenPerJenisKelamin(arrDosen);
        System.out.println("---------------------------");
        dataDosen28.rerataUsiaDosenPerJenisKelamin(arrDosen);
        System.out.println("---------------------------");
        dataDosen28.infoDosenPalingMuda(arrDosen);
        System.out.println("---------------------------");
        dataDosen28.infoDosenPalingTua(arrDosen);
        System.out.println("---------------------------");
    };
}
