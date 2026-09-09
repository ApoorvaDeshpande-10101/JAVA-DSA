import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        PrintNum(1,n);
        sc.close();
    }   

    static void PrintNum(int i,int n){
        if(i>n){
            return;
        }

        System.out.println(i);

        PrintNum(i+1,n);
    }
}
