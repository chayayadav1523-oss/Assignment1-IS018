//Leetcode 39 Combination Sum

import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current,
                                  int[] candidates, int target, int start) {

        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) return;

        for (int i = start; i < candidates.length; i++) {
            // Choose
            current.add(candidates[i]);

            // Explore (i, not i+1 because reuse allowed)
            backtrack(result, current, candidates, target - candidates[i], i);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}