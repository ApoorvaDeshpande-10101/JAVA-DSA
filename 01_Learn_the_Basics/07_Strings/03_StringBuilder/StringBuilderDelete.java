public class StringBuilderDelete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Java");

        sb.delete(6, 10);

        System.out.println(sb);
    }
}