import java.util.Scanner;
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numer: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }

        if(original == rev)
            System.out.println(original+" is a Palindrome Number");
        else
            System.out.println(original+" is not a Palindrome Number");
        sc.close();
    }
}