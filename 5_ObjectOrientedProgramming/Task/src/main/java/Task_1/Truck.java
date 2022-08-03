package Task_1;

public class Truck extends Car {

    public Truck() {
        super("Dodge", 180, 1887);
    }

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("The Truck is running" );
    }

    @Override
    public void stop() {
        System.out.println("The Truck has stopped");
    }

}
