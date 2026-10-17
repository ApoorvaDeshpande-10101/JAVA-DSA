
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Largest digit: " + largestDigit(n));

        sc.close();
    }

    static int largestDigit(int n) {
        int large = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit > large) {
                large = digit;
            }

            n = n / 10;
        }

        return large;
    }
}
