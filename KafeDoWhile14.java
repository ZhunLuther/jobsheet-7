import java.util.Scanner;
public class KafeDoWhile14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int coffee, tea, breads;
        int totalPrice;
        String customerName;
        int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;

        do {
            System.out.print ("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction cancelled");
                break;
            }
            System.out.print("Enter number of coffee: ");
            coffee = sc.nextInt();
            System.out.print("Enter number of tea: ");
            tea = sc.nextInt();
            System.out.print("Enter number of breads: ");
            breads = sc.nextInt();
            sc.nextLine();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (breads * breadPrice);
            System.out.println("Total price to be paid: Rp " + totalPrice);
            sc.nextLine();
        } while (true);
        sc.close();
        System.out.println("All transactions completed");

    }
}
