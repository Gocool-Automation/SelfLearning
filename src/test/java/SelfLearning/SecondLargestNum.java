package SelfLearning;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNum {

    public static void main(String[] args) {
        Integer[] array = {10, 5, 8, 20, 6, 13};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("First Highest value in array is " + array[0]);
        System.out.println("Seconnd Highest value in array is " + array[1]);
        highestValue(array);
    }

    private static void highestValue(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("First Highest value in array is " + array[0]);
        System.out.println("Seconnd Highest value in array is " + array[1]);

        Arrays.sort(array);
        System.out.println("First Highest value in array is " + array[array.length - 1]);
        System.out.println("First Highest value in array is " + array[array.length - 2]);
    }
}
