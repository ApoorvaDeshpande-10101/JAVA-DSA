import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {12, 4, 30, 21, 10};

        System.out.println("Array: "+Arrays.toString(arr));

        System.out.println("Max Value: "+findMax(arr));
    }

    static int findMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
