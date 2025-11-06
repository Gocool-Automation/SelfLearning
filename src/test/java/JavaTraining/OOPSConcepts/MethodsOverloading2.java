package JavaTraining.OOPSConcepts;

//Method Overloading
class Calculator2 {
    static int a;
    static int b;
    static int c;

    static void add() { // without parameters Non Static Method
        a = 10;
        b = 20;
        c = a + b;
        System.out.println(c);
    }

    static int add(int x, int y) { // with parameters
        a = x;
        b = y;
        c = a + b;
        return c;
    }

}

public class MethodsOverloading2 {

    public static void main(String[] args) {
        Calculator2.add();
        System.out.println(Calculator2.add(100, 200));

    }

}
