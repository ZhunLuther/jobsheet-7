import java.util.Scanner;
public class taskJobsheet7Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int totalTicketsSold = 0;
       double totalSalesPrice = 0;
       int ticketPrice = 50000;
       int ticket;
       double discount = 0;

       System.out.println("=== Program Penjualan Tiket Bioskop ===");
       System.out.println("Ketik '0' atau masukkan jumlah ticket negatif untuk keluar dari program.");

       while (true) {
        System.out.print("Masukkan jumlah tiket yang  dibeli: ");
        ticket = sc.nextInt();

        if (ticket ==0){
            break;
        }
        if (ticket<0){
            System.out.println("Jumlah tiket tidak boleh negatif. Silakan masukkan jumlah tiket yang valid.");
            continue;
        }        

        if (ticket > 10) {
            discount = 0.15; // 10% discount for more than 10 tickets
        } else if (ticket > 4) {
            discount = 0.05; // 5% discount for more than 5 tickets
        } else{
            discount = 0; // No discount for 5 or fewer tickets
        }
        double pricePerTicket = ticketPrice * (1 - discount);
        double totalPrice = pricePerTicket * ticket;

        totalTicketsSold += ticket;
        totalSalesPrice += totalPrice;
    }
    System.out.println("Total tiket terjual: " + totalTicketsSold);
    System.out.println("Total pendapatan: Rp " + totalSalesPrice);
    sc.close();
    }
}
