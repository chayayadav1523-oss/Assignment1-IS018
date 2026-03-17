//Leetcode 191 Number Of 1 Bits
public class NumOfBits {

    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);  // remove last 1-bit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 11; // 1011 in binary

        int result = hammingWeight(n);
        System.out.println(result);  // Output: 3
    }
}