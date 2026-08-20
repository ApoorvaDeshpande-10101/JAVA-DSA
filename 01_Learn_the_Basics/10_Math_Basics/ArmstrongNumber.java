import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = sc.nextInt();

        original = Math.abs(original);

        // Count digits
        int temp = original;
        int digits = 0;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }
        }

        // Calculate Armstrong sum
        int num = original;
        int arm = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            arm = arm + (int) Math.pow(rem, digits);
        }

        if(original == arm){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
