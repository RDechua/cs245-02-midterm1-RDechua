import java.util.Arrays;

public class Question3 {

    /**
     * Take two sorted arrays in decreasing order and
     * return a sorted array in increasing(ascending) order, that contains elements from both arr1 and arr1.
     * The algorithm must be linear.
     * You may NOT generate an array in descending order and then reverse it in a separate loop - there will be a significant deduction for such solutions.
     * @param descending1 sorted array in decreasing order, without duplicates
     * @param descending2 sorted array in decreasing order, without duplicates
     * @return sorted array in increasing order that contains elements from descending1 and descending2 arrays
     */
    public static int[] mergeTwoAscendingToGetDescending(int[] descending1, int[] descending2) {
        int[] result = new int[descending1.length + descending2.length];
        int i = descending1.length - 1;
        int j = descending2.length - 1;
        int k = 0;
        while(i >= 0 || j >= 0){
            if(i < 0){
                result[k] = descending2[j];
                k++;
                j--;
            }else if(j < 0){
                result[k] = descending1[i];
                k++;
                i--;
            }else{
                if(descending1[i] > descending2[j]){
                    result[k] = descending2[j];
                    k++;
                    j--;
                }else{
                    result[k] = descending1[i];
                    k++;
                    i--;
                }
            }

        }
        // FILL IN CODE


        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 4, 3, 1};
        int[] arr2 = {12, 8, 6, 2, 0, -8};

        int[] res = mergeTwoAscendingToGetDescending(arr1, arr2);
        System.out.println(Arrays.toString(res)); // Expected [-8, 0, 1, 2, 3, 4, 6, 7, 8, 12]
        // do additional testing on your own
    }
}
