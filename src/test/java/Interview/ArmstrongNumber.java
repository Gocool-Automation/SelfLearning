package Interview;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNum, powSum = 0, digit;

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int totalDigits = 0;

        // Store original number
        originalNum = num;

        //To find total number of digits in the given number
        int toCheckDigit = num;
        while (toCheckDigit !=0) {
            totalDigits++;
           toCheckDigit /= 10;
        }
        System.out.println("Total Digits : " + totalDigits);
        //int totalDigits = String.valueOf(num).length();

        while(num != 0) {
            digit = num % 10;
            powSum += Math.pow(digit, totalDigits);
            System.out.println("Power sum value is " + powSum);
            num = num / 10;
        }

        if(powSum == originalNum) {
            System.out.println("Given number is Armstrong number");
            System.out.println("Given number : " + originalNum);
            System.out.println("Power Sum number : " + powSum);
        }
        else {
            System.out.println("Given number is not Armstrong number");
            System.out.println("Given number : " + originalNum);
            System.out.println("Power Sum number : " + powSum);
        }
    }

}
