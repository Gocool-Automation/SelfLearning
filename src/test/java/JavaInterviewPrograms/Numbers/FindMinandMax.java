package JavaInterviewPrograms.Numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinandMax {

    public static void main(String[] args) {
        int[] num = {45, 12, 15, 98, 33, 27};

        usingForLoop(num);
        usingArraySort(num);
        usingCollections(num);
    }

    public static void usingForLoop(int[] num) {
        int min = num[0];
        int max = num[0];
        for(int i = 1; i < num.length; i++) {
            if(num[i] > max) {
                max = num[i];
            }
            if(num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Min value is : " + min);
        System.out.println("Max value is : " + max);
    }

    public static void usingArraySort(int[] num) {
        Arrays.sort(num);
        int min = num[0];
        int max = num[num.length-1];
        System.out.println("Min value is : " + min);
        System.out.println("Max value is : " + max);
    }

    public static void usingCollections(int[] num) {
        Integer[] numArray = new Integer[num.length];
        for(int i = 0; i < num.length; i++) {
            numArray[i] = num[i];
        }
        List<Integer> numberList = Arrays.asList(numArray);

        int min = Collections.min(numberList);
        int max = Collections.max(numberList);

        System.out.println("Min value is : " + min);
        System.out.println("Max value is : " + max);
    }
}
