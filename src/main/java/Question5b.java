import java.util.Arrays;

public class Question5b {

    /**
     *  Change the given insertion sort code so that:
     *
     *  it is stable
     *  it sorts the subarray from index 0 to index high  in ascending order
     *  Commit and push your code to github.
     * @param arr input array
     * @param high end index of the subarray we need to sort (inclusive)
     */
    public static void insertionSort(int[] arr, int high) {
        // TODO: Change to sort from 0 to high, and make it stable.
        int curr;
        int j;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            j = i - 1;
            while ((j >= 0) && (curr <= arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 5, 3, 5, 1, 6, 15};
        insertionSort(arr1, 4);
        System.out.println(Arrays.toString(arr1));
        // expected: [1, 3, 5, 5, 8, 6, 15]
        // sorted from index 0 to index 4 (inclusive)

        int[] arr2 = {8, 5, 3, 1, 1, 6, 2};

        insertionSort(arr2, 5);
        System.out.println(Arrays.toString(arr2));
        // sorted from index 0 to index 5 (inclusive)
        // expected [1, 1, 3, 5, 6, 8, 2]

        // Test more on your own. Don't forget to make sure you change the algorithm to be stable,
        // so that it does not change relative order of duplicates
    }
}
