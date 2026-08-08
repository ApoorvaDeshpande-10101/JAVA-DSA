import java.util.Scanner;
public class StringInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Hello "+name);
        sc.close();
    }
}
