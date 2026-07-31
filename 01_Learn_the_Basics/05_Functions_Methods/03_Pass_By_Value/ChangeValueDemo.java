import java.util.Arrays;

public class ChangeValueDemo {

    static void change(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println("Before: " + Arrays.toString(arr));

        change(arr);

        System.out.println("After : " + Arrays.toString(arr));
    }
}