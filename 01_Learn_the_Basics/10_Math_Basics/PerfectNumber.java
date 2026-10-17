
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Is Perfect Number: " + isPerfect(n));

        sc.close();
    }

    static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int perfectSum = 1;

        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) {
                perfectSum += i;

                int other = n / i;

                if (other != i) {
                    perfectSum += other;
                }
            }
        }

        return perfectSum == n;
    }
}
