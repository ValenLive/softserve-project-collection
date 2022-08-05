package Application;

class Employee implements Payment{
    private String employeeId;
    private String name;

    private double salary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void calculatePay(){

    }

    public double getSalary() {
        return salary;
    }
}
