/*
n=5
1
12
123
1234
12345
*/

import java.util.Scanner;
public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
