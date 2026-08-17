/*
----------
n=5
1        1
12      21
123    321
1234  4321
1234554321
----------
*/

import java.util.Scanner;
public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //left side
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }

            //spaces
            for (int s = 0; s < 2*(n-i); s++) {
                System.out.print(" ");
            }

            //right side
            for (int r = i; r >= 1; r--) {
                System.out.print(r);
            }
            System.out.println();
        }
        sc.close();
    }
}
