//GCD(a,b) = GCD(b%a,a) 

import java.util.Scanner;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD = "+gcd(num1,num2));
        System.out.println("LCM = "+lcm(num1,num2));

        sc.close();
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
