//Leetcode 136 Single Number using XOR

public class SingleNoUsingXOR {

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;  // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        int result = singleNumber(nums);
        System.out.println(result);  // Output: 4
    }
}