package StudentPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student studentOne = new Student("Max", 3);
        Student studentTwo = new Student("Joyce", 9);
        Student studentThree = new Student("Evelyn", 6);

        //Creating list of all students
        Collections.addAll(studentList, studentOne, studentTwo, studentThree);

        //Comparing 2 students ratings
        boolean isFirstStudentBetter = Student.betterStudent(studentOne, studentTwo);

        //Displaying data of all students
        Student.dataToString(studentList);

        //Average of all students ratings
        Student.setAvgRating(studentList);
        System.out.println("avg:" + Student.getAvgRating());

        //Total of all students rating
        int totalRatings = Student.getTotalRating(studentList);
        System.out.println("Total of ratings: " + totalRatings);
    }

}
