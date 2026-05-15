# 📘 Penjelasan Kode UTS + Ide Modifikasi

## BAGIAN 1: PENJELASAN KODE DASAR

---

### 1. Class Mahasiswa28

```java
public class Mahasiswa28 {
    String nim;        // menyimpan NIM mahasiswa
    String nama;       // menyimpan nama mahasiswa
    String prodi;      // menyimpan prodi mahasiswa

    // Konstruktor = method khusus untuk membuat objek baru
    // dipanggil saat kita tulis: new Mahasiswa28("22001", "Andi", "Teknik Informatika")
    Mahasiswa28(String nim, String nama, String prodi) {
        this.nim = nim;       // this.nim = atribut class, nim = parameter
        this.nama = nama;
        this.prodi = prodi;
    }

    // Method untuk menampilkan data mahasiswa dalam 1 baris
    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
```

**Penjelasan sederhana:**
- Class ini seperti "cetakan" untuk membuat objek mahasiswa
- `this` artinya "milik objek ini sendiri", digunakan kalau nama parameter sama dengan nama atribut
- `void` artinya method tidak mengembalikan nilai, hanya melakukan sesuatu (dalam hal ini print)

---

### 2. Class Buku28

```java
public class Buku28 {
    String kodeBuku;     // kode unik buku
    String judul;        // judul buku
    int tahunTerbit;     // tahun terbit (angka bulat)

    Buku28(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
```

**Penjelasan:** Sama seperti Mahasiswa28, ini cetakan untuk membuat objek buku.

---

### 3. Class Peminjaman28

```java
public class Peminjaman28 {
    Mahasiswa28 mhs;       // objek Mahasiswa (bukan String, tapi objek!)
    Buku28 buku;           // objek Buku
    int lamaPinjam;        // berapa hari dipinjam
    int batasPinjam = 5;   // batas maksimal = 5 hari (sudah di-set langsung)
    int terlambat;         // berapa hari terlambat
    int denda;             // total denda dalam rupiah
```

**Yang penting dipahami:**
- `Mahasiswa28 mhs` → ini bukan tipe data biasa (bukan String/int), tapi **objek** dari class Mahasiswa28
- Ini namanya **relasi antar object** → Peminjaman PUNYA mahasiswa dan PUNYA buku
- `batasPinjam = 5` → langsung diberi nilai default, tidak perlu diisi lewat konstruktor

```java
    // Konstruktor: saat buat peminjaman, langsung hitung denda
    Peminjaman28(Mahasiswa28 mhs, Buku28 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();    // <-- otomatis hitung denda saat objek dibuat
    }
```

**Kenapa hitungDenda() dipanggil di konstruktor?** Supaya begitu objek Peminjaman dibuat, denda sudah langsung terhitung. Tidak perlu dipanggil manual lagi.

```java
    // Method menghitung denda
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {          // kalau pinjam lebih dari 5 hari
            terlambat = lamaPinjam - batasPinjam; // hitung selisih hari 
            denda = terlambat * 2000;             // denda = terlambat x Rp 2.000
        } else {                                  // kalau tidak terlambat
            terlambat = 0;
            denda = 0;
        }
    }
```

**Contoh perhitungan:**
| Nama | Lama Pinjam | Batas | Terlambat | Denda |
|------|-------------|-------|-----------|-------|
| Andi | 7 hari | 5 | 7-5 = 2 | 2 × 2000 = 4000 |
| Budi | 3 hari | 5 | 0 (tidak lewat) | 0 |
| Citra | 10 hari | 5 | 10-5 = 5 | 5 × 2000 = 10000 |

---

### 4. Class Main28

#### Bagian Data Statis

```java
// Data Mahasiswa = array of object Mahasiswa28
Mahasiswa28[] dataMhs = new Mahasiswa28[3];  // buat array kosong ukuran 3
dataMhs[0] = new Mahasiswa28("22001", "Andi", "Teknik Informatika");
dataMhs[1] = new Mahasiswa28("22002", "Budi", "Teknik Informatika");
dataMhs[2] = new Mahasiswa28("22003", "Citra", "Sistem Informasi Bisnis");
```

**Penjelasan:** `Mahasiswa28[3]` artinya kita buat array yang bisa menyimpan 3 objek Mahasiswa28. Lalu kita isi satu-satu dengan `new Mahasiswa28(...)`.

#### Bagian Selection Sort (Menu 4)

```java
// Selection Sort - urutkan berdasarkan denda terbesar (descending)
for (int i = 0; i < dataPinjam.length - 1; i++) {
    int maxIdx = i;  // anggap elemen ke-i punya denda terbesar
    
    // cari elemen dengan denda terbesar dari sisa array
    for (int j = i + 1; j < dataPinjam.length; j++) {
        if (dataPinjam[j].denda > dataPinjam[maxIdx].denda) {
            maxIdx = j;  // update posisi denda terbesar
        }
    }
    
    // tukar posisi: elemen terbesar pindah ke depan
    Peminjaman28 temp = dataPinjam[i];
    dataPinjam[i] = dataPinjam[maxIdx];
    dataPinjam[maxIdx] = temp;
}
```

**Cara kerja Selection Sort (sederhana):**
1. Mulai dari elemen pertama
2. Cari denda **terbesar** dari seluruh sisa array
3. Tukar dengan posisi saat ini
4. Pindah ke elemen berikutnya, ulangi langkah 2-3
5. Selesai ketika semua elemen sudah terurut

**Contoh langkah:**
```
Awal:   [4000, 0, 10000, 2000, 0]
Step 1: [10000, 0, 4000, 2000, 0]  ← 10000 pindah ke depan
Step 2: [10000, 4000, 0, 2000, 0]  ← 4000 pindah ke posisi 2
Step 3: [10000, 4000, 2000, 0, 0]  ← 2000 pindah ke posisi 3
Step 4: [10000, 4000, 2000, 0, 0]  ← sudah benar
```

#### Bagian Sequential Search (Menu 5)

```java
System.out.print("Masukkan NIM: ");
String cariNim = sc.next();

boolean ditemukan = false;

// Sequential Search - cek satu per satu dari awal sampai akhir
for (int i = 0; i < dataPinjam.length; i++) {
    // .equals() dipakai untuk bandingkan String (bukan ==)
    if (dataPinjam[i].mhs.nim.equals(cariNim)) {
        dataPinjam[i].tampilPeminjaman();
        ditemukan = true;
        // TIDAK pakai break, karena 1 mahasiswa bisa punya banyak peminjaman
    }
}

if (!ditemukan) {
    System.out.println("Data peminjaman dengan NIM " + cariNim + " tidak ditemukan.");
}
```

**Cara kerja Sequential Search (sederhana):**
1. Mulai dari elemen pertama (index 0)
2. Cek apakah NIM-nya cocok
3. Kalau cocok → tampilkan
4. Lanjut ke elemen berikutnya, sampai habis
5. Kalau tidak ada yang cocok sama sekali → tampilkan "tidak ditemukan"

> [!IMPORTANT]
> Pakai `.equals()` untuk membandingkan String di Java, **BUKAN** `==`. Ini penting!

---

## BAGIAN 2: IDE MODIFIKASI (untuk poin tambahan)

Berikut adalah beberapa modifikasi yang bisa kamu tambahkan ke program. Setiap modifikasi akan meningkatkan nilai di rubrik **"Implementasi Method Perhitungan"** dan **"Kebenaran"**.

---

### Modifikasi 1: Hitung Total Semua Denda

**Apa yang ditambah:** Method baru di Main28 untuk menjumlahkan seluruh denda dari semua peminjaman.

**Tambahkan menu baru (misal menu 6):**

```java
} else if (pilih == 6) {
    int totalDenda = 0;
    for (int i = 0; i < dataPinjam.length; i++) {
        totalDenda = totalDenda + dataPinjam[i].denda;
    }
    System.out.println("Total denda seluruh peminjaman: Rp " + totalDenda);
}
```

**Penjelasan:** Kita looping semua data peminjaman, lalu jumlahkan denda-nya satu per satu.

**Hasil:** `Total denda seluruh peminjaman: Rp 16000` (4000 + 0 + 10000 + 2000 + 0)

---

### Modifikasi 2: Tampilkan Peminjaman yang Terlambat Saja

**Apa yang ditambah:** Menu baru yang menampilkan hanya peminjaman yang terlambat (terlambat > 0).

```java
} else if (pilih == 7) {
    System.out.println("Data Peminjaman Terlambat:");
    boolean ada = false;
    for (int i = 0; i < dataPinjam.length; i++) {
        if (dataPinjam[i].terlambat > 0) {
            dataPinjam[i].tampilPeminjaman();
            ada = true;
        }
    }
    if (!ada) {
        System.out.println("Tidak ada peminjaman yang terlambat.");
    }
}
```

**Penjelasan:** Sama seperti tampil biasa, tapi kita tambahkan syarat `if (terlambat > 0)` supaya hanya yang terlambat yang ditampilkan.

**Hasil:**
```
Data Peminjaman Terlambat:
Andi | Algoritma | Lama: 7 | Terlambat: 2 | Denda: 4000
Citra | Pemrograman | Lama: 10 | Terlambat: 5 | Denda: 10000
Citra | Fisika | Lama: 6 | Terlambat: 1 | Denda: 2000
```

---

### Modifikasi 3: Cari Peminjaman dengan Denda Terbesar

**Apa yang ditambah:** Menu baru untuk langsung menemukan peminjaman dengan denda paling tinggi.

```java
} else if (pilih == 8) {
    int maxIdx = 0;
    for (int i = 1; i < dataPinjam.length; i++) {
        if (dataPinjam[i].denda > dataPinjam[maxIdx].denda) {
            maxIdx = i;
        }
    }
    System.out.println("Peminjaman dengan denda terbesar:");
    dataPinjam[maxIdx].tampilPeminjaman();
}
```

**Penjelasan:** Kita anggap index 0 punya denda terbesar, lalu bandingkan satu per satu. Kalau ada yang lebih besar, update index-nya.

**Hasil:** `Citra | Pemrograman | Lama: 10 | Terlambat: 5 | Denda: 10000`

---

### Modifikasi 4: Hitung Total Denda Per Mahasiswa (Cari berdasarkan NIM)

**Apa yang ditambah:** Saat mencari berdasarkan NIM, juga tampilkan total denda mahasiswa tersebut.

```java
} else if (pilih == 9) {
    System.out.print("Masukkan NIM: ");
    String nim = sc.next();
    int totalDenda = 0;
    boolean ditemukan = false;
    for (int i = 0; i < dataPinjam.length; i++) {
        if (dataPinjam[i].mhs.nim.equals(nim)) {
            dataPinjam[i].tampilPeminjaman();
            totalDenda = totalDenda + dataPinjam[i].denda;
            ditemukan = true;
        }
    }
    if (ditemukan) {
        System.out.println("Total denda mahasiswa ini: Rp " + totalDenda);
    } else {
        System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
    }
}
```

**Penjelasan:** Gabungan sequential search + perhitungan total. Setiap kali ketemu NIM yang cocok, tambahkan dendanya ke totalDenda.

**Hasil (NIM 22001):**
```
Andi | Algoritma | Lama: 7 | Terlambat: 2 | Denda: 4000
Andi | Basis Data | Lama: 4 | Terlambat: 0 | Denda: 0
Total denda mahasiswa ini: Rp 4000
```

---

### Modifikasi 5: Hitung Jumlah Buku yang Dipinjam Per Mahasiswa

**Apa yang ditambah:** Menu untuk melihat berapa buku yang dipinjam oleh mahasiswa tertentu.

```java
} else if (pilih == 10) {
    System.out.print("Masukkan NIM: ");
    String nim = sc.next();
    int jumlah = 0;
    String nama = "";
    for (int i = 0; i < dataPinjam.length; i++) {
        if (dataPinjam[i].mhs.nim.equals(nim)) {
            jumlah++;
            nama = dataPinjam[i].mhs.nama;
        }
    }
    if (jumlah > 0) {
        System.out.println(nama + " meminjam " + jumlah + " buku.");
    } else {
        System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
    }
}
```

**Penjelasan:** Kita hitung berapa kali NIM muncul di array peminjaman. Setiap muncul berarti 1 buku.

**Hasil (NIM 22003):** `Citra meminjam 2 buku.`

---

### Modifikasi 6: Cari Peminjaman Berdasarkan Judul Buku

**Apa yang ditambah:** Pencarian additional berdasarkan judul buku, bukan hanya NIM.

```java
} else if (pilih == 11) {
    System.out.print("Masukkan judul buku: ");
    String judul = sc.next();
    boolean ditemukan = false;
    for (int i = 0; i < dataPinjam.length; i++) {
        if (dataPinjam[i].buku.judul.equals(judul)) {
            dataPinjam[i].tampilPeminjaman();
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Peminjaman buku \"" + judul + "\" tidak ditemukan.");
    }
}
```

**Penjelasan:** Sama seperti search NIM, tapi kali ini yang dibandingkan adalah judul buku.

---

### Modifikasi 7: Rata-Rata Denda

**Apa yang ditambah:** Menghitung rata-rata denda dari semua peminjaman.

```java
} else if (pilih == 12) {
    int totalDenda = 0;
    for (int i = 0; i < dataPinjam.length; i++) {
        totalDenda = totalDenda + dataPinjam[i].denda;
    }
    double rataRata = (double) totalDenda / dataPinjam.length;
    System.out.println("Rata-rata denda: Rp " + rataRata);
}
```

**Penjelasan:** Total denda dibagi jumlah peminjaman. `(double)` untuk memastikan hasil bagi desimal, bukan bulat.

**Hasil:** `Rata-rata denda: Rp 3200.0` (16000 / 5)

---

### Modifikasi 8: Tampilkan Mahasiswa yang Tidak Punya Denda

```java
} else if (pilih == 13) {
    System.out.println("Mahasiswa tanpa denda:");
    for (int i = 0; i < dataMhs.length; i++) {
        boolean adaDenda = false;
        for (int j = 0; j < dataPinjam.length; j++) {
            if (dataPinjam[j].mhs.nim.equals(dataMhs[i].nim) && dataPinjam[j].denda > 0) {
                adaDenda = true;
            }
        }
        if (!adaDenda) {
            dataMhs[i].tampilMahasiswa();
        }
    }
}
```

**Penjelasan:** Untuk setiap mahasiswa, kita cek apakah ada peminjaman dengan denda > 0. Kalau tidak ada, berarti mahasiswa tersebut bersih dari denda.

**Hasil:** `NIM: 22002 | Nama: Budi | Prodi: Teknik Informatika`

---

## BAGIAN 3: TIPS MEMILIH MODIFIKASI

> [!TIP]
> Kamu **tidak perlu menambahkan semua** modifikasi di atas. Pilih **2-3 yang paling kamu pahami** dan bisa kamu jelaskan ke dosen jika ditanya.

**Rekomendasi modifikasi yang mudah dipahami dan paling bernilai:**

| No | Modifikasi | Tingkat Kesulitan | Nilai Tambah |
|----|-----------|-------------------|--------------|
| 1 | Total Semua Denda | ⭐ Mudah | Tinggi (method perhitungan) |
| 2 | Peminjaman Terlambat Saja | ⭐ Mudah | Tinggi (filter data) |
| 3 | Denda Terbesar | ⭐ Mudah | Sedang (pencarian) |
| 4 | Total Denda Per Mahasiswa | ⭐⭐ Sedang | Tinggi (gabungan search + hitung) |

**Modifikasi nomor 1, 2, dan 4** adalah yang paling saya rekomendasikan karena:
- Kode-nya pendek dan mudah dipahami
- Menunjukkan kemampuan **looping**, **kondisi**, dan **perhitungan**
- Relevan dengan studi kasus (dosen pasti suka)

---

## BAGIAN 4: CARA MENAMBAHKAN MODIFIKASI KE KODE

Jika kamu ingin menambahkan modifikasi, ikuti langkah ini:

**Langkah 1:** Di bagian menu, tambahkan opsi baru:
```java
System.out.println("6. Hitung Total Denda");          // modifikasi 1
System.out.println("7. Tampilkan Peminjaman Terlambat"); // modifikasi 2
System.out.println("8. Denda Terbesar");                // modifikasi 3
```

**Langkah 2:** Di bagian `if-else`, tambahkan blok baru sesuai kode modifikasi yang dipilih (copy-paste dari atas).

**Langkah 3:** Selesai! Compile dan jalankan.
