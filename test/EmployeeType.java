package level4.test;

public enum EmployeeType {
    FULL_TIME(1.0), CONTRACT(0.8), INTERN(0.5);

    private final double baseSalary;

    EmployeeType(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double adjustBaseSalary(){
        return this.baseSalary;
    }
}
