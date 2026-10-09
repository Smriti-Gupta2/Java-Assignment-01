import java.util.*;

class BankDirectory {
    HashMap<Integer, String> accounts = new HashMap<>();

    void addAccount(int number, String name) {
        accounts.put(number, name);
        System.out.println("Account added successfully.");
    }

    void getCustomer(int number) {
        System.out.println("Account No: " + number + " -> " + accounts.get(number));
    }

    void displayAll() {
        System.out.println(accounts);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDirectory b = new BankDirectory();

        while (true) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Get Customer Name");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account No: ");
                int no = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Customer Name: ");
                b.addAccount(no, sc.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter Account No: ");
                b.getCustomer(sc.nextInt());
            } else if (choice == 3) {
                b.displayAll();
            } else {
                break;
            }
        }
    }
}