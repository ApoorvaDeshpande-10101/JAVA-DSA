import java.util.Scanner;

public class FindLargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if(num1 > num2)
            System.out.println(num1+" is Largest Number");
        else
            System.out.println(num2+" is Largest Number");

        sc.close();
    }
}
