package JavaInterviewPrograms.Numbers;

import java.util.Arrays;

public class CountNotinOrder {

    public static void main(String[] args) {
        int[] height = {1, 1, 3, 4, 5, 7, 1};
        System.out.println(count(height));

    }

    public static int count(int[] height) {
        int totalStudents = 0;
        int[] sortedHeight = new int[height.length];
        //Copying the source array values into a new array
        for (int i = 0; i < height.length; i++) {
            sortedHeight[i] = height[i];
        }

        Arrays.sort(sortedHeight);

        for (int i = 0; i < height.length; i++)
            if (height[i] != sortedHeight[i])
                totalStudents = totalStudents + 1;

        return totalStudents;
    }
}
