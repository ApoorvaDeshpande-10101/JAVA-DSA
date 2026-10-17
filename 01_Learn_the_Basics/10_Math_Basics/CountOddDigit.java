import java.util.Scanner;

public class CountOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Count of odd digits: " + countOddDigit(n));

        sc.close();
    }

    static int countOddDigit(int n) {
        int count = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }
}