/*
--------
n=5
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
--------
*/

import java.util.Scanner;
public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            //spaces
            for (int s = 0; s < 2*i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            //left side
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            //spaces
            for (int s = 0; s < 2*(n-i); s++) {
                System.out.print(" ");
            }

            //right side
            for (int r = i; r >= 1; r--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}