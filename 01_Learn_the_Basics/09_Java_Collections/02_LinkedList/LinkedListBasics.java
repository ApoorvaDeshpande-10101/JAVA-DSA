import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("\nLinkedList: " + list);

        // 1. addFirst()
        list.addFirst(100);
        System.out.println("After addFirst(100): " + list);

        // 2. addLast()
        list.addLast(200);
        System.out.println("After addLast(200): " + list);

        // 3. get()
        if (!list.isEmpty()) {
            System.out.println("Element at index 2: " + list.get(2));
        }

        // 4. getFirst()
        if (!list.isEmpty()) {
            System.out.println("First element: " + list.getFirst());
        }

        // 5. getLast()
        if (!list.isEmpty()) {
            System.out.println("Last element: " + list.getLast());
        }

        // 6. size()
        System.out.println("Size: " + list.size());

        // 7. contains()
        System.out.println("Contains 100? " + list.contains(100));

        // 8. indexOf()
        System.out.println("Index of 100: " + list.indexOf(100));

        // 9. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. Traversal
        System.out.println("\nElements:");

        for (int element : list) {
            System.out.print(element + " ");
        }

        System.out.println();

        sc.close();
    }
}