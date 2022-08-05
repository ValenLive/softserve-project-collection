package PersonPackage;

public class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am " + TYPE_PERSON);
    }

}
