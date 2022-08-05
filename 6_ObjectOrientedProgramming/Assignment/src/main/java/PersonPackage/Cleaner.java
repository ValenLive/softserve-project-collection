package PersonPackage;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void salary() {
        System.out.println("Salary of " + TYPE_PERSON + ": " + super.getSalary());
    }

    @Override
    public void print() {
        System.out.println("I am " + TYPE_PERSON);
    }

}
