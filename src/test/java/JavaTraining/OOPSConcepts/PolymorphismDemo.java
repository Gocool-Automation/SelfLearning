package JavaTraining.OOPSConcepts;

class Parent { //Run time Polymorphism --> Method Overriding
    void cry() {
        System.out.println("Parent is not crying");
    }
}

class Child1 extends Parent {
    void cry() {
        System.out.println("Child1 cries at low voice");
    }
}

class Child2 extends Parent {
    void cry() {
        System.out.println("Child2 cries at medium voice");
    }
}

class Child3 extends Parent {
    void cry() {
        System.out.println("Child3 cries at loud voice");
    }
}

public class PolymorphismDemo {
    // One action in many different forms - Ability to take many form 1:M
    // CompileTime Polymorphism & RunTime Polymorphism

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();

        Parent p; //Creating reference to the parent
        p = c1; //Initializing the child reference to the parent reference
        p.cry(); //calling the Child method which is Overriding parent method

        p = c2;
        p.cry();

        p = c3;
        p.cry();


    }

}
