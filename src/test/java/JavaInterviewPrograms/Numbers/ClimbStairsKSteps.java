package JavaInterviewPrograms.Numbers;

public class ClimbStairsKSteps {

    public static int climbWays(int n, int k) {
        if (n == 0) return 1;   // 1 way to stay at the bottom
        if (n < 0) return 0;    // no way if steps go negative

        int ways = 0;
        for (int step = 1; step <= k; step++) {
            ways += climbWays(n - step, k);
        }
        return ways;
    }

    public static void main(String[] args) {
        int n = 4, k = 3;
        System.out.println("Ways to climb " + n + " steps with up to " + k + " steps: " + climbWays(n, k));
    }
}

