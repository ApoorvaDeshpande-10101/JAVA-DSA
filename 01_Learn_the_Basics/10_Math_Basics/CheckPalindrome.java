import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = sc.nextInt();

        original = Math.abs(original);
        int num = original;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev = rev*10+rem;
        }

        if(original == rev){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }

        sc.close();
    }
}