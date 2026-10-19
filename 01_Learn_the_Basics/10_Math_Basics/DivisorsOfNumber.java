import java.util.Arrays;
import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] result = divisors(n);

        System.out.println("Divisors: " + Arrays.toString(result));

        sc.close();
    }

    static int[] divisors(int n) {
        int[] temp = new int[n];
        int count = 0;

        for (int i = 1; (long) i * i <= n; i++) {
            if (n % i == 0) {
                temp[count++] = i;

                if (i != n / i) {
                    temp[count++] = n / i;
                }
            }
        }

        Arrays.sort(temp, 0, count);

        return Arrays.copyOf(temp, count);
    }
}