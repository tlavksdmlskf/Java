package level4.test.ex2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = {new FullTimeEmployee(3000, 500), new ContractEmployee(2500), new InternEmployee(1500)};

        System.out.println("Full Time Employee Saalary: " + employees[EmployeeType.FULL_TIME.ordinal()].calculateSalary());

        System.out.println();


    for(Employee emp : employees){
        info(emp);
    }

    }

    private static void info(Employee emp){
        System.out.println(emp);
    }

}
