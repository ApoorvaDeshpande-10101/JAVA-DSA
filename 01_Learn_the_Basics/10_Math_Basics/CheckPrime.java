import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Prime Number !");
        }else{
            System.out.println("Not Prime Number !");
        }

        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }
}