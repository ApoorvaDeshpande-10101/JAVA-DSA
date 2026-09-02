import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("\nOriginal List: " + list);

        // 1. add(index, element)
        list.add(1, 100);
        System.out.println("After add(1, 100): " + list);

        // 2. set(index, element)
        list.set(1, 200);
        System.out.println("After set(1, 200): " + list);

        // 3. remove(index)
        list.remove(1);
        System.out.println("After remove(1): " + list);

        // 4. removeFirst()
        if (!list.isEmpty()) {
            list.removeFirst();
        }
        System.out.println("After removeFirst(): " + list);

        // 5. removeLast()
        if (!list.isEmpty()) {
            list.removeLast();
        }
        System.out.println("After removeLast(): " + list);

        // Add duplicates for occurrence operations
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println("After adding duplicates: " + list);

        // 6. removeFirstOccurrence()
        list.removeFirstOccurrence(20);
        System.out.println("After removeFirstOccurrence(20): " + list);

        // 7. removeLastOccurrence()
        list.removeLastOccurrence(20);
        System.out.println("After removeLastOccurrence(20): " + list);

        // 8. contains()
        System.out.println("Contains 30? " + list.contains(30));

        // 9. indexOf()
        System.out.println("Index of 30: " + list.indexOf(30));

        // 10. lastIndexOf()
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // 11. peek()
        System.out.println("peek(): " + list.peek());

        // 12. peekFirst()
        System.out.println("peekFirst(): " + list.peekFirst());

        // 13. peekLast()
        System.out.println("peekLast(): " + list.peekLast());

        // 14. offer()
        list.offer(50);
        System.out.println("After offer(50): " + list);

        // 15. offerFirst()
        list.offerFirst(60);
        System.out.println("After offerFirst(60): " + list);

        // 16. offerLast()
        list.offerLast(70);
        System.out.println("After offerLast(70): " + list);

        // 17. poll()
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // 18. pollFirst()
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("After pollFirst(): " + list);

        // 19. pollLast()
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println("After pollLast(): " + list);

        // 20. clear()
        list.clear();
        System.out.println("After clear(): " + list);

        sc.close();
    }
}