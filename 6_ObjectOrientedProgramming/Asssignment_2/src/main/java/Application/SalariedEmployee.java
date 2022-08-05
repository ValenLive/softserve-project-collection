package Application;

class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double rate;
    private int hours;


    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double rate, int hours) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                "}";
    }

    @Override
    public void calculatePay() {
        super.setSalary(rate * hours);
    }
}
