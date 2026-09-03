import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            deque.offerLast(sc.nextInt());
        }

        System.out.println("\nDeque: " + deque);

        // 1. addFirst()
        deque.addFirst(100);
        System.out.println("After addFirst(100): " + deque);

        // 2. addLast()
        deque.addLast(200);
        System.out.println("After addLast(200): " + deque);

        // 3. peekFirst()
        System.out.println("First element: " + deque.peekFirst());

        // 4. peekLast()
        System.out.println("Last element: " + deque.peekLast());

        // 5. removeFirst()
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("After removeFirst(): " + deque);

        // 6. removeLast()
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("After removeLast(): " + deque);

        // 7. offerFirst()
        deque.offerFirst(300);
        System.out.println("After offerFirst(300): " + deque);

        // 8. offerLast()
        deque.offerLast(400);
        System.out.println("After offerLast(400): " + deque);

        // 9. pollFirst()
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // 10. pollLast()
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("After pollLast(): " + deque);

        // 11. size()
        System.out.println("Size: " + deque.size());

        // 12. contains()
        System.out.println("Contains 20? " + deque.contains(20));

        // 13. isEmpty()
        System.out.println("Is deque empty? " + deque.isEmpty());

        sc.close();
    }
}