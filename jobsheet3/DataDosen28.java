public class DataDosen28 {
    public void dataSemuaDosen(Dosen28[] arrDosen) {
        int x = 1;
        for (Dosen28 dosen28 : arrDosen) {
            System.out.println("Data Dosen ke-" + (x++));
            System.out.println("Kode: " + dosen28.kode);
            System.out.println("Nama: " + dosen28.nama);
            System.out.println("Jenis Kelamin: " + (dosen28.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia: " + dosen28.usia);
            System.out.println("---------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen28[] arrDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen28 dosen28 : arrDosen) {
            if (dosen28.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen28[] arrDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        for (Dosen28 dosen28 : arrDosen) {
            if (dosen28.jenisKelamin) {
                jumlahPria++;
                totalUsiaPria += dosen28.usia;
            } else {
                jumlahWanita++;
                totalUsiaWanita += dosen28.usia;
            }
        }

        System.out.println("Rerata Usia Dosen Pria: " + (jumlahPria == 0 ? 0 : (double) totalUsiaPria / jumlahPria));
        System.out.println("Rerata Usia Dosen Wanita: " + (jumlahWanita == 0 ? 0 : (double) totalUsiaWanita / jumlahWanita));
    }

    public void infoDosenPalingTua(Dosen28[] arrDosen) {
        int maxUsia = 0;
        Dosen28 dosenPalingTua = null;
        for (Dosen28 dosen28 : arrDosen) {
            if (dosen28.usia > maxUsia) {
                maxUsia = dosen28.usia;
                dosenPalingTua = dosen28;
            }
        }

        System.out.println("Dosen Paling Tua: " + dosenPalingTua.nama);
    }

    public void infoDosenPalingMuda(Dosen28[] arrDosen) {
        int minUsia = 100;
        Dosen28 dosenTermuda = null;
        for (Dosen28 dosen28 : arrDosen) {
            if (dosen28.usia < minUsia) {
                minUsia = dosen28.usia;
                dosenTermuda = dosen28;
            }
        }

        System.out.println("Dosen Paling Muda: " + dosenTermuda.nama);
    }
}
