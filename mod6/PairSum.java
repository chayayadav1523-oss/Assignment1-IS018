import java.util.*;

public class PairSum {

    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println(complement + " + " + num + " = " + target);
            }

            set.add(num);
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 1, 5, 3};
        int target = 6;

        findPairs(arr, target);
    }
}