package Application;

import Task_1.Car;
import Task_2.Line;
import Task_3.Bird;
import Task_4.Employee;

import java.util.List;

public class ApplicationManager implements TasksInterface {
    public void executeApplication() {
        executeTask1();
        executeTask2();
        executeTask3();
        executeTask4();
    }

    private void executeTask1() {
        List<Car> cars = getCarsList();
        displayCarsInfo(cars);
    }

    private void executeTask2() {
        List<Line> lines = getLineList();
        displayLineInfo(lines);
    }

    private void executeTask3() {
        List<Bird> birds = getBirdsList();
        displayBirdsInfo(birds);
    }

    private void executeTask4() {
        List<Employee> employees = getEmployeesList();
        displayEmployeesInfo(employees);
    }


}

