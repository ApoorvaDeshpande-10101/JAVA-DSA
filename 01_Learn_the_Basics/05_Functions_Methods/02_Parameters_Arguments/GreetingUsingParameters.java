import java.util.Scanner;

public class GreetingUsingParameters {

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        greet(name);

        sc.close();
    }
}