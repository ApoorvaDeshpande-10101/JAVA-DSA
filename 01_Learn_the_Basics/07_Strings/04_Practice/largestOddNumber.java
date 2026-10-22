import java.util.Scanner;

public class largestOddNumber {
    public static String largestOddNumber(String s) {
        for(int i = s.length()-1; i>=0; i--){
            if((s.charAt(i) - '0') % 2 != 0){
                return s.substring(0, i + 1).replaceFirst("^0+", "");
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        System.out.println("Largest odd number: " + largestOddNumber(num));

        sc.close();
    }
}
