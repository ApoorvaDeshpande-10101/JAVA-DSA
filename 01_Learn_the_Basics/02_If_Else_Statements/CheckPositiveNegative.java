import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Number is Zero");
        }
        else{
            if(num > 0)
                System.out.println("Number is Positive");
            else
                System.out.println("Number is Negative");
        }
        sc.close();
    }
}
