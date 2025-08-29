import java.util.*;
class Book{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookNames = new String[3];
        int[] quantities = new int[3];

        // Accept details of 3 books
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Book Name: ");
            bookNames[i] = sc.nextLine();
            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Ask for book name to search
        System.out.print("\nEnter book name to check quantity: ");
        String searchBook = sc.nextLine();

        // Search and display quantity
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (bookNames[i].equalsIgnoreCase(searchBook)) {
                System.out.println("Quantity of \"" + bookNames[i] + "\": " + quantities[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book \"" + searchBook + "\" not found.");
        }
    }
}
