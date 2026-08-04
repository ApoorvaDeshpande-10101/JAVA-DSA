public class MaximumElement {

    static int max(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {15, 28, 10, 45, 32};

        System.out.println("Maximum Element = " + max(arr));
    }
}