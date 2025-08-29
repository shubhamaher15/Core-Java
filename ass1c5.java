import java.util.*;

class Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nAlternate characters (right aligned):");
        for (int i = 0; i < str.length(); i += 2) {
               System.out.printf("%10s\n", str.charAt(i));
        }

        sc.close();
    }
}
