import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        PrintNum(n);
        sc.close();
    }   

    static void PrintNum(int n){
        if(n < 1){
            return;
        }

        System.out.println(n);

        PrintNum(n-1);
    }
}
