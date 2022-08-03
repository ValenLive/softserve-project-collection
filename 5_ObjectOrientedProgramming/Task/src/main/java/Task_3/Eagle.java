package Task_3;

public class Eagle extends FlyingBird{
    public Eagle(int feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying Eagle");
    }
}
