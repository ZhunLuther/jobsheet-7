import java.util.Scanner;
public class jobsheet7Loop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade, highestGrade = 0, lowestGrade = 100;
        int pass=0, fail=0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            grade = sc.nextDouble();
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }
        System.out.println("Nilai tertinggi: " + highestGrade);
        System.out.println("Nilai terendah: " + lowestGrade);
        System.out.println("Jumlah mahasiswa lulus: " + pass);
        System.out.println("Jumlah mahasiswa tidak lulus: " + fail);
        sc.close();
    }
}
