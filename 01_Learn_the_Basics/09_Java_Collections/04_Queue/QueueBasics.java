import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Queue
        Queue<Integer> queue = new LinkedList<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }

        System.out.println("\nQueue: " + queue);

        // 1. offer() - Add element
        queue.offer(100);
        System.out.println("After offer(100): " + queue);

        // 2. peek() - View front element
        System.out.println("Front element: " + queue.peek());

        // 3. poll() - Remove front element
        System.out.println("Removed element: " + queue.poll());
        System.out.println("After poll(): " + queue);

        // 4. element() - View front element
        System.out.println("Front using element(): " + queue.element());

        // 5. size()
        System.out.println("Size: " + queue.size());

        // 6. contains()
        System.out.println("Contains 100? " + queue.contains(100));

        // 7. isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());

        sc.close();
    }
}