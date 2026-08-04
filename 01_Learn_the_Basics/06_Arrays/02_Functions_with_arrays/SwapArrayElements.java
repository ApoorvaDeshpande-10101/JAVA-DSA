import java.util.Arrays;

public class SwapArrayElements {

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before Swap: " + Arrays.toString(arr));

        swap(arr, 1, 3);

        System.out.println("After Swap : " + Arrays.toString(arr));
    }
}