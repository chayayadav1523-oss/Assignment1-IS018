/**
 * Program to find the sum of all even numbers between 1 and 100
 * using a while loop.
 */
public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }
}