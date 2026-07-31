import java.util.Scanner;

public class ReturnString {

    static String greet() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        sc.close();

        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
}