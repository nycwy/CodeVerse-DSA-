import java.util.Arrays;

public class Q4 {

    public static boolean isAnagram(String str1, String str2) {
        // Normalize strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Quick check for length mismatch
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String word1 = "heart";
        String word2 = "earth";

        if (isAnagram(word1, word2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
