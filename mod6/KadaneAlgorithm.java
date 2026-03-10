public class KadaneAlgorithm {
    

    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];     // stores the maximum sum found
        int currentMax = arr[0];   // stores the current subarray sum

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int result = maxSubArraySum(arr);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
