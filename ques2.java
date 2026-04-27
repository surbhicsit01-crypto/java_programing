import java.util.Scanner;
    public class ques2 {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isArmstrong(int n) {
        int temp = n, digits = 0, sum = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        while (temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }

        return sum == n;
    }

    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("\nSum is " + sum);
        System.out.println("Prime: " + (isPrime(sum) ? "Y" : "N"));
        System.out.println("Armstrong: " + (isArmstrong(sum) ? "Y" : "N"));
        System.out.println("Perfect: " + (isPerfect(sum) ? "Y" : "N"));

        sc.close();
    }
}

