import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num);

        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev = rev*10+rem;
        }

        rev = rev*sign;

        System.out.println("Reverse Number: " + rev);

        sc.close();
    }
}