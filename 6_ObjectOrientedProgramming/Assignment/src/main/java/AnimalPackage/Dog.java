package AnimalPackage;

public class Dog implements Animal{
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.println(this.breed + " dog has voice");
    }

    @Override
    public void feed() {
        System.out.println(this.breed + " dog feeds");
    }
}
