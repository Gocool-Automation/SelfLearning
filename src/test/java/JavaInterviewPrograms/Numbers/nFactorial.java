package JavaInterviewPrograms.Numbers;

import java.util.Scanner;

public class nFactorial {

    public static void main(String[] args) {
        System.out.print("Enter any Integer number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        System.out.println("Factorial of " + num + " is :: " + factorialRecursion(num));
        System.out.println("Factorial of " + num + " is :: " + factorial(num));
    }

    private static int factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1)
            fact = 1;
        else if (n > 1) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        } else
            return -1;
        return fact;
    }

    public static int factorialRecursion(int n) {
        int fact = 0;
        if (n == 0 || n == 1)
            return 1;
        else if (n > 1)
            fact = n * factorialRecursion(n - 1);
        else
            return -1;
        return fact;
    }

}
