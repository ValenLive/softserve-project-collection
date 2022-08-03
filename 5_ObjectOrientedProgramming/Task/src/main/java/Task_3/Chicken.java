package Task_3;

public class Chicken extends NonFlyingBird{
    public Chicken(int feathers, boolean layEggs, boolean hasClaws) {
        super(feathers, layEggs, hasClaws);
    }

    @Override
    public void fly() {
        System.out.println("Walking Chicken");
    }
}
