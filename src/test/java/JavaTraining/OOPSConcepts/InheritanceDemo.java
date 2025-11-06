package JavaTraining.OOPSConcepts;

class Employee {
    String name = "Sonia";
    int Salary = 50000;
}

class Programmer extends Employee { //Single level inheritance
    int bonus = 30000;
}

public class InheritanceDemo {
    public static void main(String args[]) {
        Programmer prg = new Programmer();
        System.out.println(prg.bonus);
        System.out.println(prg.name);
        System.out.println(prg.Salary);
    }

}
