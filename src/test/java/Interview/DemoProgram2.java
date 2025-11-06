package Interview;

import java.util.Arrays;

public class DemoProgram2 {
    //Walmart Interview Program to print Largest integer of the array
    public static void main(String[] args) {
        //Largest integer of the array
        int num[] = {2, 4, 3, 8, 5};
        int num1[] = {2, 4, 3, 8, 5};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println(num[num.length - 1]);
        //Using Arrays method - sort()
        System.out.println("Before Sorting " + num1[num1.length - 1]);
        Arrays.sort(num1);
        System.out.println("After Sorting " + num1[num1.length - 1]);


    }

}
