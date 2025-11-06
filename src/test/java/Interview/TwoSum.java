package Interview;

public class TwoSum {
    //This java program tries to identifies the sum of 2 numbers matches the target at the first occurrence and breaks out of the loop and returns
    //the index position of the array value that matches the target
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        //int[] nums = new int[n];
        int[] nums = {3, 2, 4, 4};
        int target = 7;

        int[] indices = findTwoSum_BruteForce(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
