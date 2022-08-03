package Application;

import Task_1.Car;
import Task_2.Line;
import Task_3.Bird;
import Task_4.Employee;

import java.util.List;

public class ApplicationManager implements TasksInterface {
    public static void executeApplication(){
        executeTask1();
        executeTask2();
        executeTask3();
        executeTask4();
    }

    private static void executeTask1() {
        List<Car> cars = TasksInterface.getCarsList();
        TasksInterface.displayCarsInfo(cars);
    }

    private static void executeTask2() {
        List<Line> lines = TasksInterface.getLineList();
        TasksInterface.displayLineInfo(lines);
    }

    private static void executeTask3() {
        List<Bird> birds = TasksInterface.getBirdsList();
        TasksInterface.displayBirdsInfo(birds);
    }

    private static void executeTask4() {
        List<Employee> employees = TasksInterface.getEmployeesList();
        TasksInterface.displayEmployeesInfo(employees);
    }


}

