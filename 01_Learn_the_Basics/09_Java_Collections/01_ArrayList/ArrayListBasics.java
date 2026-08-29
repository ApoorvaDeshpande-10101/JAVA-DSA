import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("\nOriginal ArrayList: " + list);

        // 1. add(element)
        list.add(100);
        System.out.println("After add(100): " + list);

        // 2. add(index, element)
        list.add(1, 200);
        System.out.println("After add(1, 200): " + list);

        // 3. get(index)
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set(index, element)
        list.set(2, 300);
        System.out.println("After set(2, 300): " + list);

        // 5. size()
        System.out.println("Size: " + list.size());

        // 6. contains(element)
        System.out.println("Contains 100? " + list.contains(100));

        // 7. indexOf(element)
        System.out.println("Index of 100: " + list.indexOf(100));

        // 8. lastIndexOf(element)
        list.add(100);
        System.out.println("Last index of 100: " + list.lastIndexOf(100));

        // 9. remove(index)
        list.remove(1);
        System.out.println("After remove(1): " + list);

        // 10. remove(element)
        list.remove(Integer.valueOf(100));
        System.out.println("After removing value 100: " + list);

        // 11. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 12. clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // 13. isEmpty() after clear
        System.out.println("Is list empty? " + list.isEmpty());

        sc.close();
    }
}