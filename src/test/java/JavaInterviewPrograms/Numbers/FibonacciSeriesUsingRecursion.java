package JavaInterviewPrograms.Numbers;

public class FibonacciSeriesUsingRecursion {

    //Fibonnaci Numbers using Recursive methods
    public static void main(String[] args) {
        int n = 5;
        int num = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        System.out.print("Ways to climb " + num + " Steps are " + fib(num));
    }

    private static int fib(int k) {
        if (k <= 1) {
            return k;
        }
        return fib(k - 1) + fib(k - 2);
    }
}
