package Jobsheet9;

public class StackTugasMahasiswa28 {
    Mahasiswa28[] stack;
    int size;
    int top;

    public StackTugasMahasiswa28(int size) {
        this.size = size;
        stack = new Mahasiswa28[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa28 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa28 pop() {
        if (!isEmpty()) {
            Mahasiswa28 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa28 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            // Perbaikan untuk soal 2.1.3 nomor 1, ubah arah loop agar cetak dari data terakhir ke awal
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        } else {
            System.out.println("Stack kosong!");
        }
    }

    // Jawaban Praktikum 2.1.3 no 4 (Melihat tugas pertama / terbawah)
    public Mahasiswa28 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Jawaban Praktikum 2.1.3 no 5 (Menghitung jumlah tugas yang sudah dikumpulkan)
    public int count() {
        return top + 1;
    }

    // Jawaban Percobaan 2
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi28 stackKonversi = new StackKonversi28();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop();
        }
        return biner;
    }
}
