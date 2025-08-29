import java.util.*; 
class PerfectNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Perfect numbers between 1 and " + n + " are:");

        for (int num = 1; num <= n; num++) {
            int sum = 0;

            // Find sum of proper divisors
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            // Check if sum equals the number
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
