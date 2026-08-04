import java.util.Arrays;
public class ReverseArray {
    
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.println("Array Before Reverse: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array After Reverse: "+Arrays.toString(arr));
    }    
}
