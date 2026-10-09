import java.util.*;

class Library {
    ArrayList<String> books = new ArrayList<>();

    void addBook(String book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    void removeBook(String book) {
        books.remove(book);
        System.out.println("Book removed successfully.");
    }

    void displayBooks() {
        System.out.println("Current Books: " + books);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter book title: ");
                l.addBook(sc.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter book title: ");
                l.removeBook(sc.nextLine());
            } else if (choice == 3) {
                l.displayBooks();
            } else {
                break;
            }
        }
    }
}