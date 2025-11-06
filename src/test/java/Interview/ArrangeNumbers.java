package Interview;

public class ArrangeNumbers {
    //An array which has 1010101010 as elements, program so that array element should have all 1's on right and 0's are left (without using the temporary array)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        int n = arr.length;

        reorder0and1(arr, n);
        print(arr, n);
    }

    public static void reorder0and1(int[] arr, int n) {
        int count = 0;
        for(int num : arr) {
            if(num == 0) {
                count++;
            }
        }
        /*
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
        */
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 1;
        }
    }

    public static void print(int[] arr, int n) {
        System.out.print("Re-ordered array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
