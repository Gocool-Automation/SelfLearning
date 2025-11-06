package JavaTraining.OOPSConcepts;

abstract class Animals {
    abstract void animalSound();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    void eat() {

    }

    static void awake() {

    }

    final void run() {

    }
}

class Dogs extends Animals {
    public void animalSound() {
        System.out.println("Dog is barking : Bow Bow");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sleep();
        d.animalSound();


    }

}
