package Interview;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        int num1 = 0;
        int num2 = 1;
        int count = 0;

        while (count < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count++;
        }
    }
}
