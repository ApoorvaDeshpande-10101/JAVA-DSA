import java.util.Arrays;

public class VariableArgumentsDemo {

    static void display(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {

        display();
        display(10);
        display(10, 20);
        display(10, 20, 30, 40, 50);
    }
}