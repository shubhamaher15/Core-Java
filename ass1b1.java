import java.util.*;
import java.util.Arrays;
class SortCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] cities = new String[n];

        System.out.println("Enter " + n + " city names:");
        for (int i = 0; i < n; i++) {
            cities[i] = sc.nextLine();
        }

        Arrays.sort(cities);

        System.out.println("\nCities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
