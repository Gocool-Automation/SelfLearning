package JavaTraining.OOPSConcepts;

class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog1 {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MulLvlInheritanceDemo {

    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();

    }

}
