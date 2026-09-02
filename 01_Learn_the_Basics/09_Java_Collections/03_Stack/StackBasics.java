import java.util.Stack;
import java.util.Scanner;

public class StackBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Stack
        Stack<Integer> stack = new Stack<>();

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("\nStack: " + stack);

        // 1. push() - Add element to top
        stack.push(100);
        System.out.println("After push(100): " + stack);

        // 2. peek() - View top element without removing
        System.out.println("Top element: " + stack.peek());

        // 3. pop() - Remove and return top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop(): " + stack);

        // 4. search() - Position from top
        System.out.println("Position of 100: " + stack.search(100));

        // 5. empty() - Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. size() - Number of elements
        System.out.println("Size: " + stack.size());

        // 7. contains() - Check if element exists
        System.out.println("Contains 20? " + stack.contains(20));

        // 8. Access element using get()
        System.out.println("Element at index 0: " + stack.get(0));

        sc.close();
    }
}