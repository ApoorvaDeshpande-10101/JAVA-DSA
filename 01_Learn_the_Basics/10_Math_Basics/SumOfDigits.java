import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }

        System.out.println("Sum of Digits: " + sum);

        sc.close();
    }
}