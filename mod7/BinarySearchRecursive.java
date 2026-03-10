public class BinarySearchRecursive {

    public static int binarySearch(int arr[], int low, int high, int target) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, low, mid - 1, target);
        } 
        else {
            return binarySearch(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        int target = 8;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}