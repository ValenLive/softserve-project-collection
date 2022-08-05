package AnimalPackage;

public class Cat implements Animal{
    private String breed;

    public Cat(String breed) {
        this.breed = breed;
    }

    @Override
    public void feed() {
        System.out.println(this.breed + " cat feeds");
    }

    @Override
    public void voice() {
        System.out.println(this.breed + " cat has voice");
    }
}
