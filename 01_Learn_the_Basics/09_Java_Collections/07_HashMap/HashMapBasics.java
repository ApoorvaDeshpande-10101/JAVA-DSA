import java.util.HashMap;
import java.util.Scanner;

public class HashMapBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Input
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        System.out.println("Enter key and value:");

        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(key, value);
        }

        System.out.println("\nHashMap: " + map);

        // 1. put() - Add / Update
        map.put(100, "Java");
        System.out.println("After put(100, Java): " + map);

        // 2. get() - Get value using key
        System.out.println("Value for key 100: " + map.get(100));

        // 3. getOrDefault()
        System.out.println(
                "Value for key 999: " + map.getOrDefault(999, "Not Found")
        );

        // 4. containsKey()
        System.out.println("Contains key 100? " + map.containsKey(100));

        // 5. containsValue()
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // 6. putIfAbsent()
        map.putIfAbsent(100, "Python");
        System.out.println("After putIfAbsent(): " + map);

        // 7. replace()
        map.replace(100, "Collections");
        System.out.println("After replace(): " + map);

        // 8. remove()
        map.remove(100);
        System.out.println("After remove(100): " + map);

        // 9. size()
        System.out.println("Size: " + map.size());

        // 10. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 11. clear()
        map.clear();
        System.out.println("After clear(): " + map);

        // 12. isEmpty() after clear
        System.out.println("Is map empty? " + map.isEmpty());

        sc.close();
    }
}