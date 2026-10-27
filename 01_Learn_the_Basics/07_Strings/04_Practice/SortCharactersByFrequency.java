import java.util.*;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {

        int[] freq = new int[128];

        // Count character frequencies
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Create frequency buckets
        List<Character>[] buckets =
                new ArrayList[s.length() + 1];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Map characters to their frequency buckets
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                buckets[freq[i]].add((char) i);
            }
        }

        // Build result from highest frequency to lowest
        StringBuilder result = new StringBuilder();

        for (int i = buckets.length - 1; i >= 1; i--) {
            for (char ch : buckets[i]) {
                for (int j = 0; j < i; j++) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";

        System.out.println(frequencySort(s));
    }
}
