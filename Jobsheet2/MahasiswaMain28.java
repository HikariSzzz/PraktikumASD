package Jobsheet2;

public class MahasiswaMain28 {
    public static void main(String[] args) {
        
        Mahasiswa28 mhsl = new Mahasiswa28();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkaninformasi();
        mhsl.ubahKelas("SI 2J");
        mhsl.updateIpk(3.60);
        mhsl.tampilkaninformasi();

        Mahasiswa28 mhs2 = new Mahasiswa28("Annisa Nabila", "2131720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkaninformasi();
    }   
}
