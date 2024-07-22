package level4.test;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = {new FullTimeEmployee(3000, 500, EmployeeType.FULL_TIME), new ContractEmployee(2500,EmployeeType.CONTRACT), new InternEmployee(1500,EmployeeType.INTERN)};

        for (Employee employee : employees){
            System.out.println(employee.getEmployeeType().toString().replace("_", " ") + " Employee Salary: " + employee.calculateSalary());
        }


        System.out.println();

        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
