/*
----------
n=5
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
----------
*/

import java.util.Scanner;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n-i-1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }
            for (int l = i-1; l >= 0; l--) {
                char ch = (char) (l+'A');
                System.out.print(ch);
            }
            
            System.out.println();
        }

        sc.close();
    }
}
