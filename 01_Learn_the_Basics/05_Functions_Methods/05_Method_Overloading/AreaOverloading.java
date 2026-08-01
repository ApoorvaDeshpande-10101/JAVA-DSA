public class AreaOverloading {

    static int area(int side) {
        return side * side;
    }

    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println("Area of Square = " + area(5));
        System.out.println("Area of Circle = " + area(2.5));
    }
}