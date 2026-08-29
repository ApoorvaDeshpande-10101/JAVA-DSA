import java.util.ArrayList;
import java.util.Scanner;

public class NestedArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create nested ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Create each row
        for (int i = 0; i < rows; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();

            System.out.println("Enter " + cols + " elements:");

            for (int j = 0; j < cols; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        // Print nested ArrayList
        System.out.println("\nNested ArrayList:");
        System.out.println(list);

        // Traverse using nested for-each loop
        System.out.println("\nElements:");

        for (ArrayList<Integer> row : list) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Access a particular element
        if (!list.isEmpty() && !list.get(0).isEmpty()) {
            System.out.println("\nFirst element: " + list.get(0).get(0));
        }

        sc.close();
    }
}