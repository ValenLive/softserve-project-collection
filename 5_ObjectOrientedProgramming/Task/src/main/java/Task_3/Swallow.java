package Task_3;

public class Swallow extends FlyingBird{
    public Swallow(int feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("Flying Swallow");
    }
}
