import java.util.Scanner;

public class ReturnInteger {

    static int sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        sc.close();

        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum = " + result);
    }
}