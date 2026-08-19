/*
--------
n=5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
--------
*/

import java.util.Scanner;
public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int stars = 1;
        int spaces = 2 * (n - 1);

        for (int i = 1; i <= 2*n; i++) {
            //left side
            for (int l = 1; l <= stars; l++) {
                System.out.print("*");
            }

            //spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            //right side
            for (int r = stars; r >= 1; r--) {
                System.out.print("*");
            }
            

            if(i<n){
                stars++;
                spaces -= 2;
            }
            else{
                stars--;
                spaces += 2;
            }

            System.out.println();
        }
        sc.close();
    }
}