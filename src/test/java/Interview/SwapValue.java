package Interview;

public class SwapValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swapAddSub(a, b);
        swapXOR(a, b);
        swapMulDiv(a, b);
        oneline(a, b);
        swapWithTemp(a, b);
    }

    public static void swapWithTemp(int a, int b) {
        System.out.println("Values before swapping : a = " + a + " and b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Values after swapping : a = " + a + " and b = " + b);
    }

    public static void oneline(int a, int b) {
        System.out.println("Values before swapping : a = " + a + " and b = " + b);
        /*
        We can write only one line to swap two numbers.
        x = x ^ y ^ (y = x);
        x = x + y – (y = x);
        x = (x * y) / (y = x);
         */
        a = a + b - (b = a);
        System.out.println("Values after swapping : a = " + a + " and b = " + b);
    }

    public static void swapMulDiv(int a, int b) {
        System.out.println("Values before swapping : a = " + a + " and b = " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Values after swapping : a = " + a + " and b = " + b);
    }

    public static void swapXOR(int a, int b) {
        System.out.println("Values before swapping : a = " + a + " and b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values after swapping : a = " + a + " and b = " + b);
    }

    public static void swapAddSub(int a, int b) {
        System.out.println("Values before swapping : a = " + a + " and b = " + b);
        a = a + b; // a = 5 + 10 =  15
        b = a - b; // b = 15 - 10 = 5
        a = a - b; // a = 15 - 5 = 10
        System.out.println("Values after swapping : a = " + a + " and b = " + b);
    }

}
