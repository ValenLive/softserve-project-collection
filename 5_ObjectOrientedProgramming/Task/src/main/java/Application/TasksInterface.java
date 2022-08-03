package Application;

import Task_1.Car;
import Task_1.Sedan;
import Task_1.Truck;
import Task_2.ColorLine;
import Task_2.Line;
import Task_2.Point;
import Task_3.*;
import Task_4.Developer;
import Task_4.Employee;

import java.util.List;

public interface TasksInterface {
    /**
     * Task 1
     */
    default List<Car> getCarsList() {
        return List.of(
                new Sedan("Royal", 230, 2000),
                new Sedan("Aston Martin", 460, 2011),
                new Truck("Baumbach", 90, 2007),
                new Truck("Volvo", 110, 1995),
                new Sedan(),
                new Truck()
        );
    }

    default void displayCarsInfo(List<Car> cars) {
        cars.forEach(System.out::println);
    }

    /**
     * Task 2
     */
    default List<Line> getLineList() {
        return List.of(
                new Line(new Point(1, 2), new Point(3, 4)),
                new Line(new Point(5, 6), new Point(7, 8)),
                new ColorLine(new Point(10, 10), new Point(23, 14), "Red"),
                new ColorLine(new Point(11, 5), new Point(13, 4), "Cyan"),
                new ColorLine(new Point(3, 2), new Point(1, 2), "Purple")
        );
    }

    default void displayLineInfo(List<Line> lines) {
        lines.forEach(Line::print);
    }

    /**
     * Task 3
     */
    default List<Bird> getBirdsList() {
        return List.of(
                new Eagle(3, true),
                new Swallow(5, true),
                new Penguin(34, false, true, true),
                new Chicken(12, false, false)
        );
    }

    default void displayBirdsInfo(List<Bird> birds) {
        birds.forEach(Bird::fly);
    }

    /**
     * Task 4
     */
    default List<Employee> getEmployeesList() {
        return List.of(
                new Employee("Thomas", 23, 2300.34),
                new Employee("Max", 14, 1400),
                new Developer("Valentine", 22, 2500, "Java Developer"),
                new Developer("Julia", 22, 2499.99, "Java Developer XL")
        );
    }

    default void displayEmployeesInfo(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee.report()));
    }

}
