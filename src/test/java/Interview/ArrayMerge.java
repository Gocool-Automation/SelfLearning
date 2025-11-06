package Interview;

public class ArrayMerge {
    //Java Program to Merge to sorted arrays
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 0};
        int[] arr3 = new int[arr1.length + arr2.length];

        mergeArrays(arr1, arr2, arr3);
        System.out.println();
        System.out.print("Not really Merged Array output : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[k++] = arr2[i];
        }
        System.out.print("Array after merging : ");
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
    }
}
