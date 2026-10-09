import java.util.*;

class Inventory {
    HashMap<Integer, Integer> products = new HashMap<>();

    void addProduct(int id, int stock) {
        products.put(id, stock);
        System.out.println("Product " + id + " added with stock " + stock);
    }

    void updateStock(int id, int stock) {
        products.put(id, stock);
        System.out.println("Stock updated.");
    }

    void displayInventory() {
        Iterator<Integer> i = products.keySet().iterator();

        while (i.hasNext()) {
            int id = i.next();
            System.out.println("Product ID: " + id + " Stock: " + products.get(id));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory in = new Inventory();

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Stock: ");
                int stock = sc.nextInt();
                in.addProduct(id, stock);
            } else if (choice == 2) {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                System.out.print("Enter New Stock: ");
                int stock = sc.nextInt();
                in.updateStock(id, stock);
            } else if (choice == 3) {
                in.displayInventory();
            } else {
                break;
            }
        }
    }
}