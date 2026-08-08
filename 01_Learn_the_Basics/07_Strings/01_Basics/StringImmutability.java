
public class StringImmutability {
    public static void main(String[] args) {
        String name = "Apurva";

        name.concat(" Deshpande");
        System.out.println(name);

        name = name.concat(" Deshpande");
        System.out.println(name);
    }
}
