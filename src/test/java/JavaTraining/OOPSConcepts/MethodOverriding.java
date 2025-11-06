package JavaTraining.OOPSConcepts;

class Animal {
    void eat() {
        System.out.println("eat() method from Base/Parent class");
        System.out.println("Action is just Eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eat() method from Derived/Child class");
        System.out.println("Dog is eating");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        Animal a1 = new Dog();
        d.eat();
        a.eat();
        a1.eat();

    }

}
