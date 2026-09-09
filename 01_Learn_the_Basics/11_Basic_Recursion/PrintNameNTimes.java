import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        PrintName(1, n, name);
        sc.close();
    }   
    
    static void PrintName(int i,int n,String name){
        //Base condition
        if(i>n){
            return;
        }

        System.out.println(name);
        PrintName( i+ 1, n, name);
    }
}
