package Application;

public class Helicopter extends FlyingVehicle {
    private final int weight;
    private int maxHeight;

    public Helicopter(Passengers passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                '}';
    }

    @Override
    public void fly() {
        System.out.println(this + " is flying");
    }

    @Override
    public void land() {
        System.out.println(this + " is landing");
    }
}
