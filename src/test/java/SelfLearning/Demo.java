package SelfLearning;

class Calculator {
    int a;
    int b;
    int c;

    void add(int x, int y) {
        a = x;
        b = y;
        c = a + b;
        System.out.println(c);
    }
}

class Demo {
    public static void main(String args[]) {
        Calculator d = new Calculator();
        d.add(10, 20);
    }
}