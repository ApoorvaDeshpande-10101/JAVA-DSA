/*
---------
n=5
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5
---------
*/

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int size = 2*n-1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int minDistance = Math.min(
                    Math.min(i,j),
                    Math.min(size-1-i, size-1-j)
                );

                int val = n-minDistance;
                System.out.print(val+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
