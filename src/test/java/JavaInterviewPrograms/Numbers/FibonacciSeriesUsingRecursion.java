package JavaInterviewPrograms.Numbers;

public class FibonacciSeriesUsingRecursion {

    //Fibonnaci Numbers using Recursive methods
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

}
