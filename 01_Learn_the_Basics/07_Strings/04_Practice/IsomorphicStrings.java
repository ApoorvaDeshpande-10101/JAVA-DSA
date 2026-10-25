
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[256];
        int[] indexT = new int[256];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (indexS[a] != indexT[b]) {
                return false;
            }

            indexS[a] = i + 1;
            indexT[b] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }
}
