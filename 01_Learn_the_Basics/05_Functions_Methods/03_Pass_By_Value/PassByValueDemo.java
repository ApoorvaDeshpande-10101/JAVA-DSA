public class PassByValueDemo {

    static void changeName(String name) {
        name = "Riya";
        System.out.println("Inside Method: " + name);
    }

    public static void main(String[] args) {

        String name = "Apurva";

        System.out.println("Before Method Call: " + name);

        changeName(name);

        System.out.println("After Method Call: " + name);
    }
}