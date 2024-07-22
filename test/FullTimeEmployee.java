package level4.test;

public class FullTimeEmployee implements Employee{
    private double baseSalary, bonus;
    private EmployeeType type;

    public FullTimeEmployee(int baseSalary, int bonus, EmployeeType type) {
        this.bonus = bonus;
        this.baseSalary = baseSalary;
        this.type = type;
    }


    @Override
    public double calculateSalary(){
        return (bonus + baseSalary) * type.adjustBaseSalary();
    }
    public EmployeeType getEmployeeType(){
        return type;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{baseSalary="+baseSalary+", bonus="+bonus+", employeeType="+type+"}";
    }
}
