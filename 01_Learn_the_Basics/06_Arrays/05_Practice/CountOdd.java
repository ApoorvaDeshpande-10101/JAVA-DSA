import java.util.Scanner;

public class CountOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countOdd(arr, n);

        System.out.println("Count of odd numbers: " + result);

        sc.close();
    }

    static int countOdd(int[] arr, int n) {
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
    }
}