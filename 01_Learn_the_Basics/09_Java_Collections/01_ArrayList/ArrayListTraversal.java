import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTraversal {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // 1. Using normal for loop
        System.out.println("1. Normal for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


        // 2. Using enhanced for loop (for-each)
        System.out.println("2. Enhanced for loop:");

        for (int x : list) {
            System.out.print(x + " ");
        }

        System.out.println();


        // 3. Using Iterator
        System.out.println("3. Iterator:");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();


        // 4. Using ListIterator - Forward traversal
        System.out.println("4. ListIterator - Forward:");

        ListIterator<Integer> litr = list.listIterator();

        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }

        System.out.println();


        // 5. Using ListIterator - Backward traversal
        System.out.println("5. ListIterator - Backward:");

        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }

        System.out.println();


        // 6. Using forEach() method
        System.out.println("6. forEach():");

        list.forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}