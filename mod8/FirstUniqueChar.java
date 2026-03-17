//Leetcode 387 First Unique Character in a String

public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int result = firstUniqChar(s);
        System.out.println(result);  // Output: 0
    }
}