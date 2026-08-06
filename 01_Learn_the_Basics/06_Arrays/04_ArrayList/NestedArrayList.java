import java.util.ArrayList;
import java.util.Scanner;

public class NestedArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // //initialization
        // for (int i = 0; i < 3; i++) {
        //     list.add(new ArrayList<>());
        // }

        // //add elements
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         list.get(i).add(sc.nextInt());
        //     }
            
        // }


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        list.add(list1);
        list.add(list2);
        System.out.println(list);

            sc.close();
    }

    
}
