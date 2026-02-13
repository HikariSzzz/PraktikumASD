public class RoyalGarden {
    
    // fungsi untuk menghitung pendapatan
    public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;
        
        int total = (aglonema * hargaAglonema) +
                    (keladi * hargaKeladi) +
                    (alocasia * hargaAlocasia) +
                    (mawar * hargaMawar);
        
        return total;
    }
    
    
    // fungsi untuk menentukan status
    public static String tentukanStatus(int pendapatan) {
        
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
        
    }
    
    
    public static void main(String[] args) {
        
        // array 2D stock bunga
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        System.out.println("Pendapatan RoyalGarden");
        System.out.println("=======================");
        
        for (int i = 0; i < stock.length; i++) {
            
            int pendapatan = hitungPendapatan(
                stock[i][0],
                stock[i][1],
                stock[i][2],
                stock[i][3]
            );
            
            String status = tentukanStatus(pendapatan);
            
            System.out.println("RoyalGarden " + (i+1));
            System.out.println("Pendapatan : Rp." + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println();
        }
        
    }
}
