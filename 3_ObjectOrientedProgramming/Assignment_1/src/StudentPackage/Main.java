package StudentPackage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = getStudentList();

        //Comparing 2 students ratings
        boolean isFirstStudentBetter = studentList.get(0).betterStudent(studentList.get(1));

        //toString first student
        System.out.println(studentList.get(0).toString());

        //Displaying data of all students
        Student.dataToString(studentList);

        //Average of all students ratings
        Student.setAvgRating(studentList);
        System.out.println("avg:" + Student.getAvgRating());

        //Total of all students rating
        int totalRatings = Student.getTotalRating(studentList);
        System.out.println("Total of ratings: " + totalRatings);
    }

    private static List<Student> getStudentList() {
        return List.of(
                new Student("Max", 3),
                new Student("Joyce", 9),
                new Student("Evelyn", 6)
        );
    }

}
