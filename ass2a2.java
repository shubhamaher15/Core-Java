import java.util.*;
class Fibo{

    // Function to print Fibonacci series up to n terms
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        
        printFibonacci(terms);
    }
}
