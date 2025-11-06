package JavaInterviewPrograms.Numbers;

public class ClimbStairs {

    public static void main(String[] args) {
        int n = 5;
        System.out.print("Ways to climb " + n + " Steps are " + climbWays(n));
    }

    private static int climbWays(int n) {
        if(n <= 1) {
            return 1;
        }
        return climbWays(n-1) + climbWays(n-2);
    }
}
