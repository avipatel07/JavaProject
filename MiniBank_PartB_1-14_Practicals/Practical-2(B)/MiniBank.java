
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

        BankInfo bank = new BankInfo(
            "MiniBank",
            "Surat Main Branch"
        );

        System.out.println("==================================");
        System.out.println("       WELCOME TO MINIBANK");
        System.out.println("==================================");
        System.out.println("Bank Name: " + bank.name());
        System.out.println("Branch: " + bank.branch());

        System.out.println("\n========== CUSTOMER DETAILS ==========");

        Customer c1 = new Customer(
            "Aarav Shah", "aarav@gmail.com", "9876543210"
        );

        Customer c2 = new Customer(
            "Riya Patel", "riya@gmail.com", "9876543211"
        );

        Customer c3 = new Customer(
            "Karan Mehta", "karan@gmail.com", "9876543212"
        );

        Customer[] customers = {c1, c2, c3};

        for (Customer customer : customers) {
            System.out.println(
                customer.getCustomerId() + " | " +
                customer.getName() + " | " +
                customer.getEmail() + " | " +
                customer.getMobile()
            );
        }

        System.out.println("\n========== ACCOUNT OPERATIONS ==========");

        Account[] accounts = {
            new Account(c1.getName(), 5000),
            new Account(c2.getName()),
            new Account(c3.getName(), 10000)
        };

        accounts[0].deposit(2000);
        accounts[1].deposit(3000);
        accounts[2].withdraw(2500);

        for (Account account : accounts) {
            System.out.println(
                "Account Number: " + account.getAccountNumber()
            );
            System.out.println(
                "Owner: " + account.getOwnerName()
            );
            System.out.println(
                "Balance: Rs. " + account.getBalance()
            );
            System.out.println(
                "Active: " + account.isActive()
            );
            System.out.println("----------------------------------");
        }

        boolean running = true;

        while (running) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("===============================");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine();

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
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
                System.out.println("Invalid choice. Select 1 to 5.");
                continue;
            }

            if (option == MenuOption.EXIT) {
                System.out.println("Thank you for using MiniBank!");
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
                case EXIT -> "Exiting MiniBank...";
            };

            System.out.println(message);
        }

        sc.close();
    }
}
