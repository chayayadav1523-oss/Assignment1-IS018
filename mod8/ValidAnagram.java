//leetcode 242 Valid Anagram

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Subtract characters using t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        // Check if all values are 0
        for (int num : count) {
            if (num != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);
        System.out.println(result);  // Output: true
    }
}