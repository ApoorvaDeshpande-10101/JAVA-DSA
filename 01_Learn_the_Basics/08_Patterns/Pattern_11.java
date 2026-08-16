/*
----------
n=5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
----------
*/
import java.util.Scanner;
public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
