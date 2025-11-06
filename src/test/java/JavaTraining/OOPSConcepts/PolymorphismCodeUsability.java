package JavaTraining.OOPSConcepts;

class Airport {
    void permit(Plane p) {
        p.takeoff();
        p.fly();
        p.land();
    }

}

class Plane {
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

class CargoPlane extends Plane {
    void fly() {
        System.out.println("Cargo Plane flying at low height");
    }

    void carryGoods() {
        System.out.println("Cargo Plane carrying Goods");
    }

}

class PassengerPlane extends Plane {
    void fly() {
        System.out.println("Passenger Plane flying at medium height");
    }

    void carryPassenger() {
        System.out.println("Passenger Plane carring Passengers");
    }
}

class FighterPlane extends Plane {
    void fly() {
        System.out.println("Fighter Plane flying at maximum height");
    }

    void carryWeapon() {
        System.out.println("Fighter Plane carring Weapons");
    }
}

public class PolymorphismCodeUsability {

    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.permit(cp);
        cp.carryGoods();
        a.permit(pp);
        pp.carryPassenger();
        a.permit(fp);
        fp.carryWeapon();
		
		/*
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
		*/

    }

}
