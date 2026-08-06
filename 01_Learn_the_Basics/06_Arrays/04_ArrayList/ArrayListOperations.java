import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        list.set(1, 50);
        System.out.println("After set(): " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.remove(0);
        System.out.println("After remove(): " + list);

        System.out.println("Contains 30? " + list.contains(30));

        System.out.println("Size: " + list.size());
    }
}