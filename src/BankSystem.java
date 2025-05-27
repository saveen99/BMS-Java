import java.util.Scanner;

class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String name) {
        ownerName = name;
        balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Deposited $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn $" + amount);
        } else {
            System.out.println("❌ Not enough money!");
        }
    }

    void showBalance() {
        System.out.println("💰 Your balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🏦 Welcome to My Little Bank!");
        System.out.print("👤 Enter your name: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);
        System.out.println("✅ Account created for " + name);

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Deposit 💰");
            System.out.println("2. Withdraw 💸");
            System.out.println("3. Check Balance 👀");
            System.out.println("4. Exit 🚪");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                account.showBalance();
            } else if (choice == 4) {
                System.out.println("👋 Goodbye!");
                break;
            } else {
                System.out.println("❌ Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
