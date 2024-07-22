package level4.test;

public class InternEmployee implements Employee{
    private double baseSalary;
    private EmployeeType type;

    public InternEmployee(int baseSalary, EmployeeType type) {
        this.baseSalary = baseSalary;
        this.type = type;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * type.adjustBaseSalary();
    }


    @Override
    public EmployeeType getEmployeeType() {
        return type;
    }

    @Override
    public String toString() {
        return "InternEmployee{baseSalary="+baseSalary+ ", employeeType="+type+"}";
    }
}
