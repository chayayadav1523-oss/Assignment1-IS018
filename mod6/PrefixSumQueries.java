
public class PrefixSumQueries {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        // Step 1: Construct Prefix Sum Array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Range Sum Queries
        int L = 1;
        int R = 3;

        int sum;
        if(L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L - 1];

        System.out.println("Sum from index " + L + " to " + R + " = " + sum);
    }
}