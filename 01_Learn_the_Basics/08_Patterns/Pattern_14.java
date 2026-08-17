/*
----------
n=5
A
AB
ABC
ABCD
ABCDE
----------
*/

import java.util.Scanner;
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch+" ");
            }
            
            System.out.println();
        }

        sc.close();
    }
}
