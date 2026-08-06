import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Using for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using for-each loop:");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}