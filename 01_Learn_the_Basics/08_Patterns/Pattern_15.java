/*
----------
n=5
ABCDE
ABCD
ABC
AB
A
----------
*/

import java.util.Scanner;
public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }
            
            System.out.println();
        }

        sc.close();
    }
}
