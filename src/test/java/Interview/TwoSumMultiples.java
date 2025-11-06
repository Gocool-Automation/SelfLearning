package Interview;

public class TwoSumMultiples {

    public static void main(String[] args) {

		/*
		 * Input: nums = [2,7,11,15], target = 9
			Output: [0,1]
			Explanation: Because nums[0] + nums[1] == 9,
			we return [0, 1].

		 */
        int[] num = {3, 2, 4, 5, 4};
        int target = 7;
        int matchcount = 0;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    index1 = i;
                    index2 = j;
                    System.out.println("Values that adds up to the target " + target + " are " + index1 + " and " + index2 + ", values - " + num[index1] + " and " + num[index2]);
                    matchcount++;
                    //break;
                }
            }
        }
        if (matchcount != 0) {
            System.out.println("Target of Two sum numbers are found");
        } else
            System.out.println("Target of Two sum numbers are not found");
    }
}
