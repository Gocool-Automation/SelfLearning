package JavaTraining.OOPSConcepts;

class Plane1 {
    void takeoff() {
        System.out.println("Plane taking off");
    }

    void fly() {
        System.out.println("Plane flying");
    }

    void land() {
        System.out.println("Plane landing");
    }

}

class CargoPlane1 extends Plane1 {
    void fly() {
        System.out.println("Cargo Plane flying at low height");
    }

    void carryGoods() {
        System.out.println("Cargo Plane carrying Goods");
    }

}

class PassengerPlane1 extends Plane1 {
    void fly() {
        System.out.println("Passenger Plane flying at medium height");
    }

    void carryPassenger() {
        System.out.println("Passenger Plane carring Passengers");
    }
}

class FighterPlane1 extends Plane1 {
    void fly() {
        System.out.println("Fighter Plane flying at maximum height");
    }

    void carryWeapon() {
        System.out.println("Fighter Plane carring Weapons");
    }
}

public class InheritanceAssignment {

    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
        PassengerPlane1 pp = new PassengerPlane1();
        FighterPlane1 fp = new FighterPlane1();

        cp.takeoff();
        cp.fly();
        cp.carryGoods();
        cp.land();

        pp.takeoff();
        pp.fly();
        pp.carryPassenger();
        pp.land();

        fp.takeoff();
        fp.fly();
        fp.carryWeapon();
        fp.land();

    }

}
