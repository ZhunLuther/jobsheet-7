import java.util.Scanner;
public class jobsheet7task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi, total = 0;
        System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 keluar): ");
        jenis = sc.nextInt(); 
        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if ( jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan jenis kendaraan yang valid.");    
            }
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 keluar): ");
            jenis = sc.nextInt();

                    
                   
        }
        System.out.println("Total biaya parkir: Rp " + total);
        sc.close();

    }
}
