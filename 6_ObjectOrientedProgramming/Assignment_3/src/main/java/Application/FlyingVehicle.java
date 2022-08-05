package Application;

public class FlyingVehicle implements Vehicle{
    private Passengers passengers;

    public FlyingVehicle(Passengers passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "FlyingVehicle{" +
                "passengers" + passengers.getPassengers() +
                '}';
    }

    public void fly(){
        System.out.println("FlyingVehicle is flying");
    }

    public void land(){
        System.out.println("FlyingVehicle is landing");
    }
}
