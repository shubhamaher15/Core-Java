import java.util.*;
class SearchName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Name found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found in the array.");
        }
    }
}
