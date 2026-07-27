import java.util.Scanner;
public class FibonacciSeries {
    // 0 1 1 2 3 5 8 13 21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();

        int num1 = 0, num2= 1;
        int fact;

        System.out.print(num1+ " " +num2+ " ");
        for(int i=3;i<=n;i++){
            fact = num1 + num2;
            System.out.print(fact+" ");
            num1 = num2;
            num2 = fact;
        }
        sc.close();
    }

}
