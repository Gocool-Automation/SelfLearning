package JavaInterviewPrograms.Numbers;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int input = num;
        int sum = 0;
        int totalDigits = String.valueOf(num).length();
        System.out.println("Total Digits " + totalDigits);

        while (num > 0) {
            int remainder = num % 10;
            sum += (int) Math.pow(remainder, totalDigits);
            num /=10;
        }

        System.out.println("Sum of Digits " + sum);
        if(input == sum)
            System.out.println("Given number is an Armstrong number");
        else
            System.out.println("Given number is not an Armstrong number");
    }
}
