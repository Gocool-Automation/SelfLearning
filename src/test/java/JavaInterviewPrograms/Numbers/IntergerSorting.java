package JavaInterviewPrograms.Numbers;

public class IntergerSorting {

    public static void main(String[] args) throws Exception {
        //Rotate the sorted array from the position d using a temp array
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        //Expected Output: 3 4 5 6 7 1 2
        int d = 2;
        int temp[] = new int[arr.length];
        int k = 0;

        for (int i = d; i < arr.length; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(temp[i] + " ");
    }
}
