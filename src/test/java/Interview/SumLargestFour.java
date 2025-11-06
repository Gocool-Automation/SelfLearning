package Interview;

import java.util.Arrays;
import java.util.Collections;

public class SumLargestFour {

    /*Have the function largest four (arr) take the array of integers stored in arr and find the four largest elements and return their sum.
    for example: arr is [4,5,-2,3,1,2,6,6] then the four largest elements in this is 6,6,4,5 total sum is 21?
     */

    public static int largestSumAscending(Integer[] arr, int totalValues) {
        int sum = 0;
        Arrays.sort(arr);
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (count != totalValues) {
                sum = sum + arr[i];
                count++;
            } else
                break;
        }
        return sum;
    }

    private static int largestSumDescending(Integer[] arr, int totalValues) {
        int sum = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < totalValues; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 5, -2, 3, 1, 2, 6, 6};
        int totalValues = 4;

        System.out.println("\n" + "Sum of Largest 4 values of given array : " + largestSumAscending(arr, totalValues));
        System.out.println("\n" + "Sum of Largest 4 values of given array : " + largestSumDescending(arr, totalValues));
    }
}
