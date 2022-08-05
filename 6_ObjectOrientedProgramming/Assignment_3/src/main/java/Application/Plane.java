package Application;

public class Plane extends FlyingVehicle{

    public Plane(Passengers passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + " is flying");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getName() + " is landing");
    }
}
