import java.util.Scanner;
import java.util.Arrays;
class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n of emp names? ");
        int n = sc.nextInt();
        sc.nextLine(); // newline consume

        String[] names = new String[n];

        // Accept names
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + " name ");
            names[i] = sc.nextLine();
        }

        // Sort names
        Arrays.sort(names);

        // Display sorted names
        System.out.println("\n📋 Sorted Employee Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
