
import java.util.Scanner;

record BankInfo(String name, String branch) {
}

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

public class MiniBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankInfo bank = new BankInfo("MiniBank", "Surat Main Branch");

        System.out.println("==================================");
        System.out.println("       WELCOME TO MINIBANK");
        System.out.println("==================================");
        System.out.println(bank);
        System.out.println();

        boolean running = true;

        while (running) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine();

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            MenuOption option = switch (choice) {
                case 1 -> MenuOption.OPEN_ACCOUNT;
                case 2 -> MenuOption.DEPOSIT;
                case 3 -> MenuOption.WITHDRAW;
                case 4 -> MenuOption.TRANSFER;
                case 5 -> MenuOption.EXIT;
                default -> null;
            };

            if (option == null) {
                System.out.println("Invalid choice! Please select between 1 and 5.");
                continue;
            }

            if (option == MenuOption.EXIT) {
                System.out.println("\nThank you for using MiniBank!");
                System.out.println("Have a nice day!");
                running = false;
                continue;
            }

            String message = switch (option) {
                case OPEN_ACCOUNT ->
                    "Open Account - To be implemented in a later lab.";

                case DEPOSIT ->
                    "Deposit - To be implemented in a later lab.";

                case WITHDRAW ->
                    "Withdraw - To be implemented in a later lab.";

                case TRANSFER ->
                    "Transfer - To be implemented in a later lab.";

                case EXIT ->
                    "Exiting MiniBank...";
            };

            System.out.println("\n" + message);
        }

        sc.close();
    }
}
