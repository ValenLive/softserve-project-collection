package Application;

public class Main {
    public static void main(String[] args) {
        FlyingVehicle flyingVehicle = new Helicopter(new Passengers(7),1100,1450);
        flyingVehicle.fly();
        flyingVehicle.land();
        System.out.println(flyingVehicle);
        
        Vehicle vehicle = new Plane(new Passengers(100));
        System.out.println(vehicle);
    }
}
