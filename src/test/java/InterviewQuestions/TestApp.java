package InterviewQuestions;

import java.util.Scanner;

public class TestApp {

    public static void main(String[] args) {
        // To find the given number is odd number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 != 0) {
            System.out.println("odd number");
        } else {
            System.out.println("even number");
        }
    }

}
