import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        System.out.print("Enter no. of entries: ");
        int n = sc.nextInt();

        System.out.print("Enter key and value: ");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String  value = sc.next();
            map.put(key,value);
        }
        System.out.println("\nHashMap: " + map);

        // 1. Traverse using keySet()
        System.out.println("\n1. Using keySet():");

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 2. Traverse using entrySet()
        System.out.println("\n2. Using entrySet():");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        // 3. Traverse using forEach()
        System.out.println("\n3. Using forEach():");

        map.forEach((key, value) ->
                System.out.println(key + " -> " + value)
        );

        // 4. Traverse keys only
        System.out.println("\n4. Keys:");

        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        // 5. Traverse values only
        System.out.println("\n5. Values:");

        for (String value : map.values()) {
            System.out.print(value + " ");
        }

        System.out.println();

        // 6. Using Iterator
        System.out.println("\n6. Using Iterator:");

        Iterator<Map.Entry<Integer, String>> itr =
                map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<Integer, String> entry = itr.next();

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        sc.close();
    }
}
