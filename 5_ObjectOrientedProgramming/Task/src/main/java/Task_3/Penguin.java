package Task_3;

public class Penguin extends NonFlyingBird{
    private boolean hasTwoEyes;
    public Penguin(int feathers, boolean layEggs, boolean hasClaws, boolean hasTwoEyes) {
        super(feathers, layEggs, hasClaws);
        this.hasTwoEyes = hasTwoEyes;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Walking Penguin");
    }
}
