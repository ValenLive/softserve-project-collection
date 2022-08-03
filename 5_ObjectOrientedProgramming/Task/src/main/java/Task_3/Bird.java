package Task_3;

public abstract class Bird {
    private int feathers;
    private boolean layEggs;

    public Bird(int feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

}
