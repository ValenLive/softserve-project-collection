package Task_3;

public class NonFlyingBird extends Bird{
    private boolean hasClaws;
    public NonFlyingBird(int feathers, boolean layEggs, boolean hasClaws) {
        super(feathers, layEggs);
        this.hasClaws = hasClaws;
    }

    @Override
    public void fly() {
        System.out.println(hasClaws);
    }

}
