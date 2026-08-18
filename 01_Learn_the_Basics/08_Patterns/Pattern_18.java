/*
----------
n=5
E 
D E 
C D E 
B C D E 
A B C D E
----------
*/

import java.util.Scanner;
public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        char x = (char) ('A' + n-1);

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                char ch = (char) (x - j);
                System.out.print(ch);
            }
            
            System.out.println();
        }

        sc.close();
    }
}
