package Application;

public class Student{
    private final String NAME;
    private final int COURSE;

    public Student(String NAME, int course) {
        this.NAME = NAME;
        this.COURSE = course;
    }

    public int getCOURSE() {
        return COURSE;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + NAME + '\'' +
                ", course=" + COURSE +
                '}';
    }

}
