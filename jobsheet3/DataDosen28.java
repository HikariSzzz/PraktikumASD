public class DataDosen28 {
    public void dataSemuaDosen(DosenJS3_28[] arrDosen) {
        int x = 1;
        for (DosenJS3_28 dosen28 : arrDosen) {
            System.out.println("Data Dosen ke-" + (x++));
            System.out.println("Kode: " + dosen28.kode);
            System.out.println("Nama: " + dosen28.nama);
            System.out.println("Jenis Kelamin: " + (dosen28.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia: " + dosen28.usia);
            System.out.println("---------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(DosenJS3_28[] arrDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (DosenJS3_28 dosen28 : arrDosen) {
            if (dosen28.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(DosenJS3_28[] arrDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        for (DosenJS3_28 dosen28 : arrDosen) {
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

    public void infoDosenPalingTua(DosenJS3_28[] arrDosen) {
        int maxUsia = 0;
        DosenJS3_28 dosenPalingTua = null;
        for (DosenJS3_28 dosen28 : arrDosen) {
            if (dosen28.usia > maxUsia) {
                maxUsia = dosen28.usia;
                dosenPalingTua = dosen28;
            }
        }

        System.out.println("Dosen Paling Tua: " + dosenPalingTua.nama);
    }

    public void infoDosenPalingMuda(DosenJS3_28[] arrDosen) {
        int minUsia = 100;
        DosenJS3_28 dosenTermuda = null;
        for (DosenJS3_28 dosen28 : arrDosen) {
            if (dosen28.usia < minUsia) {
                minUsia = dosen28.usia;
                dosenTermuda = dosen28;
            }
        }

        System.out.println("Dosen Paling Muda: " + dosenTermuda.nama);
    }
}
