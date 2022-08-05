package Application;

class ContractEmployee extends Employee {
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double salary) {
        super(employeeId, name);
        super.setSalary(salary);
        this.federalTaxIdMember = federalTaxIdMember;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                "}";
    }


}
