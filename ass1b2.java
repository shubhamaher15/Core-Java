import java.util.*;
class ArmstrongArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] input = new int[n];
        int[] armstrong = new int[n]; // Max possible size
        int count = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();

            if (isArmstrong(input[i])) {
                armstrong[count] = input[i];
                count++;
            }
        }

        System.out.println("\nArmstrong numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(armstrong[i]);
        }
    }
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }
}
