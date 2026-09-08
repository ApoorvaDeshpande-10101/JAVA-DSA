import java.util.HashSet;
import java.util.Scanner;

public class HashSetBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("\nHashSet: " + set);

        // 1. add() - Add element
        set.add(100);
        System.out.println("After add(100): " + set);

        // 2. Adding duplicate
        set.add(100);
        System.out.println("After adding duplicate 100: " + set);

        // 3. contains() - Check if element exists
        System.out.println("Contains 100? " + set.contains(100));

        // 4. remove() - Remove element
        set.remove(100);
        System.out.println("After remove(100): " + set);

        // 5. size() - Number of unique elements
        System.out.println("Size: " + set.size());

        // 6. isEmpty() - Check if empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 7. Traversal
        System.out.println("\nElements:");

        for (int element : set) {
            System.out.print(element + " ");
        }

        System.out.println();

        // 8. Clear all elements
        set.clear();
        System.out.println("After clear(): " + set);

        // 9. Check empty
        System.out.println("Is set empty? " + set.isEmpty());

        sc.close();
    }
}