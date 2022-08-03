package Task_1;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    abstract void run();

    abstract void stop();
}
