import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        String[] items = {"Water", "Juice", "Chips"};
        int[] prices = {20, 35, 25};
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("1 Water  2 Juice  3 Chips  0 Checkout");
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice < 1 || choice > 3) { System.out.println("Invalid selection"); continue; }
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            if (qty <= 0) { System.out.println("Quantity must be positive"); continue; }
            total += prices[choice - 1] * qty;
            System.out.println(items[choice - 1] + " added. Bill = Rs." + total);
        }
        System.out.println("Please pay Rs." + total);
    }
}
