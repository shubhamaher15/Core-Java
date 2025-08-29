import java.util.*;
class Power{

    // Recursive method to calculate power
    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1; // Base case: any number raised to 0 is 1
        else
            return base * power(base, exponent - 1); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
