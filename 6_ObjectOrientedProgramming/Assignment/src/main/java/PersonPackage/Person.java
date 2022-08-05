package PersonPackage;

public abstract class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
