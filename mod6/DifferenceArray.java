
public class DifferenceArray {

    public static void rangeUpdate(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] diff = new int[n];

        // Step 1: Build difference array
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        // Step 2: Apply range updates
        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];
            int val = q[2];

            diff[L] += val;
            if (R + 1 < n) {
                diff[R + 1] -= val;
            }
        }

        // Step 3: Reconstruct the final array using prefix sum
        arr[0] = diff[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        // Print final array
        System.out.println("Updated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // queries: {L, R, value_to_add}
        int[][] queries = {
            {1, 3, 5},
            {0, 2, 10}
        };

        rangeUpdate(arr, queries);
    }
}