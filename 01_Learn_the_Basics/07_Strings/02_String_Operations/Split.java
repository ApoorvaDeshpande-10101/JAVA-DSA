public class Split {
    public static void main(String[] args) {

        String name = "Apurva Deshpande";

        String[] words = name.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}