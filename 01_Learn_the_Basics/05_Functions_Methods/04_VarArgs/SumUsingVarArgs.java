public class SumUsingVarArgs {

    static int sum(int... numbers){
        int total = 0;
        for(int num : numbers)
            total += num;

        return total;
    }
    public static void main(String[] args) {
        System.out.println("Sum = "+sum(10,20));
        System.out.println("Sum = "+sum(5,10,15));
        System.out.println("Sum = "+sum(1,2,3,4,5));
    }
}
