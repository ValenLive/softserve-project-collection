package StudentPackage;

import java.util.List;

public class Student {
    private final String NAME;
    private final int RATING;

    private static double avgRating;


    public Student() {
        this("Placeholder", 0);
    }

    public Student(String name, int rating) {
        this.NAME = name;
        this.RATING = rating;
    }


    public String getName() {
        return NAME;
    }

    public int getRating() {
        return RATING;
    }

    public static double getAvgRating() {
        return avgRating;
    }

    public static boolean betterStudent(Student student1, Student student2) {
        return student1.RATING > student2.RATING;
    }

    public static void dataToString(List<Student> studentList) {
        studentList.forEach(student -> System.out.println("name: " + student.NAME + "; rating: " + student.RATING));
    }

    public static void setAvgRating(List<Student> studentList) {
        avgRating = (double) getTotalRating(studentList) / studentList.size();
    }

    public static int getTotalRating(List<Student> studentList) {
        return studentList
                .stream()
                .reduce(0, (subTotal, student) -> subTotal + student.RATING, Integer::sum);//Using combiner to solve type problem || Baeldung .reduce
    }
}
