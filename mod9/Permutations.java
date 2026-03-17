//Leetcode 46 Permutations

import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {
        // If permutation is complete
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip if already used
            if (used[i]) continue;

            // Choose
            used[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(result, current, nums, used);

            // Backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);

        System.out.println(result);
    }
}