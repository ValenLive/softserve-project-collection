package Task_1;

public class Sedan extends Car {

    public Sedan() {
        super("Mustang", 240, 1998);
    }

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("The Sedan is running");
    }

    @Override
    public void stop() {
        System.out.println("The Sedan has stopped");
    }

}
