//Leetcode 49 Group Anagrams

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert string to char array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Create key
            String key = new String(chars);

            // Add to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}