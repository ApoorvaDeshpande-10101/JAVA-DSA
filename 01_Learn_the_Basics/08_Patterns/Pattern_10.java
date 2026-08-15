/*
---------
n=5
*
**
***
****
*****
****
***
**
*
---------
*/

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int stars = 1;
        
        for (int i = 1; i < 2*n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            if(i<n){
                stars++;
            }
            else{
                stars--;
            }

            System.out.println();
        }
        sc.close();
    }
}