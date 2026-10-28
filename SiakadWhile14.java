import java.util.Scanner;
public class SiakadWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade, total, i = 0;
        total = 0;
        System.out.print("Enter the number of students: ");
        total = sc.nextInt();

       
        

        while (i < total){
            System.out.println("Enter the grade of the  " + (i+1) + " student: ");
            grade = sc.nextInt();

            if (grade < 0 || grade > 100){
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                continue; 
            }
            
            if (grade > 80 && grade<= 100){
                System.out.println("Grade " + (i + 1) + ": A");
            } else if (grade > 73 && grade <= 80){
                System.out.println("Grade " + (i + 1) + ": B+");
            } else if (grade > 65 && grade <= 73){
                System.out.println("Grade " + (i + 1) + ": B");
            } else if (grade > 60 && grade <= 65){
                System.out.println("Grade " + (i + 1) + ": C+");
            } else if (grade > 50 && grade <= 60){
                System.out.println("Grade " + (i + 1) + ": C");
            } else if (grade > 39 && grade <= 50){
                System.out.println("Grade " + (i + 1) + ":  D");
            } else {
                System.out.println("Grade " + (i + 1) + ": E");
            }
            i++;
            
        }
     sc.close();   
    }
}
