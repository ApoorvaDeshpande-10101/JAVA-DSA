import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }

        System.out.println("\nPriorityQueue: " + pq);

        // 1. offer() - Add element
        pq.offer(5);
        System.out.println("After offer(5): " + pq);

        // 2. add() - Add element
        pq.add(2);
        System.out.println("After add(2): " + pq);

        // 3. peek() - View highest-priority element
        System.out.println("Highest priority element: " + pq.peek());

        // 4. poll() - Remove highest-priority element
        System.out.println("Removed: " + pq.poll());
        System.out.println("After poll(): " + pq);

        // 5. size()
        System.out.println("Size: " + pq.size());

        // 6. contains()
        System.out.println("Contains 5? " + pq.contains(5));

        // 7. isEmpty()
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());

        // 8. Remove a specific element
        pq.remove(5);
        System.out.println("After remove(5): " + pq);

        // 9. Traverse / process elements by priority
        System.out.println("\nElements in priority order:");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        System.out.println();

        sc.close();
    }
}