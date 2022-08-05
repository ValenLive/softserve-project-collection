package PersonPackage;

public abstract class Staff extends Person {
    private int salary;

    Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    public abstract void salary();
}
