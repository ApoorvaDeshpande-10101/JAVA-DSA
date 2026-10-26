import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        // Decrease frequencies using t
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;

            if (arr[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String t = sc.nextLine().toLowerCase();

        if (isAnagram(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
