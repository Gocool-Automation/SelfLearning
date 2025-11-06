package JavaTraining.OOPSConcepts;

//Method Overloading
class Calculator {
    int a;
    int b;
    int c;

    void add() { //without parameters Non Static Method
        a = 10;
        b = 20;
        c = a + b;
        System.out.println(c);
    }

    int add(int a, int b) { //with parameters
        this.a = a;
        this.b = b;
        c = this.a + this.b;
        return c;
    }

}

public class MethodsOverloading {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
        System.out.println(calc.add(100, 200));

    }

}
