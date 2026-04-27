import java.util.Scanner;
    public class ques4 {


    // Non-recursive (Iterative) method
    static void fibonacciIterative(int n) {
        int a = 0, b = 1;

        System.out.print("Non-Recursive Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Recursive method to find nth Fibonacci number
    static int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Non-recursive Fibonacci
        fibonacciIterative(n);

        // Recursive Fibonacci
        System.out.print("Recursive Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        sc.close();
    }
}

