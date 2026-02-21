import java.util.Scanner;

public class PerulanganNIM {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nim;
        int n;
        
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        
        // Ambil 2 digit terakhir
        n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        // Jika kurang dari 10 tambah 10
        if (n < 10) {
            n = n + 10;
        }
        
        System.out.println("n = " + n);
        System.out.print("Output: ");
        
        for (int i = 1; i <= n; i++) {
            
            // Lewati 10 dan 15
            if (i == 10 || i == 15) {
                continue;
            }
            
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.print("* ");
            }
        }
        
        input.close();
    }
}
