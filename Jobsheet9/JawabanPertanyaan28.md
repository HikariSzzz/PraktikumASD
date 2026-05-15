# Jawaban Pertanyaan Jobsheet 9 (Stack)

## 2.1.3 Pertanyaan (Percobaan 1)

1. **Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?**
   **Jawaban:** Bagian yang diperbaiki adalah method `print()` di class `StackTugasMahasiswa28`. Awalnya loop kemungkinan dibuat membesar (`for (int i=0; i<=top; i++)`), namun pada contoh output, urutan nama (Tika, Erik, Dila) menunjukkan data dicetak dari elemen teratas (terakhir dimasukkan) hingga elemen terbawah (pertama dimasukkan). Perbaikannya adalah mengubah arah perulangan:
   ```java
   public void print() {
       if (!isEmpty()) {
           for (int i = top; i >= 0; i--) { // Perubahan disini
               System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
           }
           System.out.println("");
       } else {
           System.out.println("Stack kosong!");
       }
   }
   ```

2. **Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!**
   **Jawaban:** Stack tersebut dapat menampung maksimal **5** data tugas mahasiswa. Potongan kode pengaturannya ada pada instansiasi objek di method main pada `MahasiswaDemo28`:
   ```java
   StackTugasMahasiswa28 stack = new StackTugasMahasiswa28(5);
   ```

3. **Mengapa perlu pengecekan kondisi `!isFull()` pada method `push`? Kalau kondisi if-else tersebut dihapus, apa dampaknya?**
   **Jawaban:** Pengecekan `!isFull()` (apakah stack belum penuh) perlu dilakukan agar program tahu bahwa masih ada slot kosong di dalam array `stack` sebelum menambahkan elemen baru. Jika pengecekan ini dihapus dan stack ternyata sudah penuh (`top == size - 1`), saat dipaksakan melakukan `push`, maka nilai indeks `top` akan di-increment melampaui batas maksimal indeks array. Hal ini akan mengakibatkan error fatal saat runtime yaitu `ArrayIndexOutOfBoundsException`.

4. **Modifikasi kode program pada class `MahasiswaDemo` dan `StackTugasMahasiswa` sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!**
   **Jawaban:** 
   Tambahan method `peekBottom()` di `StackTugasMahasiswa28`:
   ```java
   public Mahasiswa28 peekBottom() {
       if (!isEmpty()) {
           return stack[0]; // Mereturn data index paling awal
       } else {
           System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
           return null;
       }
   }
   ```
   Tambahan pada menu di `MahasiswaDemo28`:
   ```java
   case 5:
       Mahasiswa28 lihatBawah = stack.peekBottom();
       if (lihatBawah != null) {
           System.out.println("Tugas pertama dikumpulkan oleh " + lihatBawah.nama);
       }
       break;
   ```

5. **Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!**
   **Jawaban:**
   Tambahan method `count()` di `StackTugasMahasiswa28`:
   ```java
   public int count() {
       return top + 1; // Karena index array dimulai dari 0
   }
   ```
   Tambahan pada menu di `MahasiswaDemo28`:
   ```java
   case 6:
       System.out.println("Jumlah tugas yang telah dikumpulkan: " + stack.count());
       break;
   ```

## 2.2.3 Pertanyaan (Percobaan 2)

1. **Jelaskan alur kerja dari method `konversiDesimalKeBiner`!**
   **Jawaban:** 
   Alur kerjanya mengimplementasikan algoritma pembagian 2 berturut-turut dengan bantuan struktur data Stack:
   - Sebuah objek Stack array khusus integer (kapasitas 32 bit) disiapkan melalui `StackKonversi28`.
   - Melalui perulangan `while (nilai > 0)`, program akan terus-menerus mengambil sisa bagi nilai desimal saat ini dengan angka 2 (`int sisa = nilai % 2;`). Sisa bagi (yang pasti berupa 0 atau 1) ini lalu dipush (dimasukkan) ke dalam StackKonversi.
   - Pada tiap iterasi, desimal tersebut dibagi dengan 2 (`nilai = nilai / 2`) untuk diperkecil ukurannya sesuai kaidah konversi.
   - Apabila nilai desimal sudah menjadi 0 (perhitungan selesai), program melakukan loop `while (!stackKonversi.isEmpty())` untuk me-pop (mengeluarkan) seluruh elemen dari stack dan merangkainya ke dalam string biner.
   - Karena sifat Stack adalah LIFO (Last In First Out), maka elemen sisa pembagian paling terakhir akan dikeluarkan di urutan paling awal, sehingga secara otomatis bit-bit akan tersusun dalam format biner yang benar (dibaca dari bawah ke atas pada kertas buram perhitungan).

2. **Pada method `konversiDesimalKeBiner`, ubah kondisi perulangan menjadi `while (kode != 0)` *(dimaksud parameter fungsi yakni `nilai != 0`)*, bagaimana hasilnya? Jelaskan alasannya!**
   **Jawaban:** 
   Jika diubah dari `while (nilai > 0)` menjadi `while (nilai != 0)`, **hasilnya akan tetap sama dan berjalan dengan baik untuk nilai-nilai positif (termasuk nilai mahasiswa)**. Alasannya karena untuk inputan bilangan positif, variabel integer `nilai` yang terus-menerus dibagi 2 pada akhirnya akan menjadi 0, sehingga kondisi `!= 0` pun akan memutus perulangan (memberhentikan operasi) dengan waktu yang sama persis seperti kondisi `> 0`. 
   
   Catatan: Perbedaan baru akan terjadi apabila diberikan input angka *negatif*. Kondisi `> 0` akan mencegah masuknya angka negatif, sementara `!= 0` akan meloloskan dan bisa berisiko *infinite loop* atau stack overflow pada bilangan negatif, mengingat pembagian `int` bernilai ganjil negatif dalam Java terkadang tidak langsung menuju angka eksak nol dalam representasi desimal bertandanya. Tapi berhubung *range* nilai tugas mahasiswa tidak mungkin kurang dari nol, tidak ada perbedaan output pada pemakaian method tersebut.
