package JavaTraining;

import java.util.Scanner;

public class OneDimensionalArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5]; //data storage for 5 data value

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a value for the array of index " + i + " :: ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Values in the array are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
