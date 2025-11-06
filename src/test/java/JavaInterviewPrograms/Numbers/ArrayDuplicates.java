package JavaInterviewPrograms.Numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 6, 4, 8, 9, 7, 6, 7, 3, 3, 6, 7};
        int[] arr1 = new int[]{1, 2, 3};

        int len = arr.length;
        int len1 = arr1.length;
        printDuplicatesUsingArrayList(arr, len);
        printDuplicatesUsingHash(arr, len);

    }

    private static void printDuplicatesUsingHash(int[] arr, int len) {
        System.out.print("Using Hash Duplicate values in the given array are :: ");
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean dup = false;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else
                map.put(arr[i], 1);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                dup = true;
            }
        }

        //if no duplicates present
        if (!dup) {
            System.out.println(-1);
        }

    }

    //This method finding duplicates using ArrayLis
    static void printDuplicatesUsingArrayList(int[] arr, int len) {
        System.out.print("Using ArrayList Duplicate values in the given array are :: ");
        //The below logic will work only if the duplicate count is < 2 occurrence. If matching count greater than 2, it will print the output with duplicates as well
		/* for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		} */
        boolean dup = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        dup = true;
                        break;
                    } else {
                        al.add(arr[i]);
                        dup = true;
                    }
                }
            }
        }
        if (dup == true) {
            System.out.println(al);
        } else
            System.out.println("No duplicate values in the array");
    }
}
