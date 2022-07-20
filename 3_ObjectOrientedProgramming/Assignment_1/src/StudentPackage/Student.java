package StudentPackage;

import java.util.ArrayList;

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

    public static void dataToString(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("name: " + student.NAME + "; rating: " + student.RATING);
        }
    }

    public static void setAvgRating(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            avgRating += student.getRating();
        }
        avgRating /= studentList.size();
    }

    public static int getTotalRating(ArrayList<Student> studentList){
        int total = 0;
        for (Student student : studentList) {
            total += student.RATING;
        }
        return total;
    }
}
