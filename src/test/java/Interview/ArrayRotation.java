package Interview;

public class ArrayRotation {

    /* Write a function that accepts 2 arguments. An array, and an Integer d
and left rotate the array by d positions+
input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arrFinal = new int[arr.length];
        int d = 2;
        int j = 0;

        for (int i = d; i < arr.length; i++) {
            arrFinal[j++] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arrFinal[j++] = arr[i];
        }

        for (int i = 0; i < arrFinal.length; i++) {
            System.out.print(arrFinal[i] + " ");
        }

    }
}
