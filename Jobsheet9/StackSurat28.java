package Jobsheet9;

public class StackSurat28 {
    Surat28[] stack;
    int size;
    int top;

    public StackSurat28(int size) {
        this.size = size;
        stack = new Surat28[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat28 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat28 pop() {
        if (!isEmpty()) {
            Surat28 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack surat kosong!");
            return null;
        }
    }

    public Surat28 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack surat kosong!");
            return null;
        }
    }

    // Method cari surat berdasarkan nama mahasiswa secara sekuensial (Latihan Praktikum no 4)
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        // Cari dari atas tumpukan
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\nSurat ditemukan!");
                System.out.println("ID Surat: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis Izin: " + (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's' ? "Sakit" : "Izin Lainnya"));
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("\nSurat izin dari mahasiswa bernama " + nama + " tidak ditemukan.");
        }
    }
}
