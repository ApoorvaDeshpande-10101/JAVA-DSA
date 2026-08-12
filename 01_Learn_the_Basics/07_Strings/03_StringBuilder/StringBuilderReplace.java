public class StringBuilderReplace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Java");

        sb.replace(6, 10, "World");

        System.out.println(sb);
    }
}