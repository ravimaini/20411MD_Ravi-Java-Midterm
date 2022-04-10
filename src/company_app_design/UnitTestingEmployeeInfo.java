package company_app_design;

public class UnitTestingEmployeeInfo {

    /**
     * Use this class to write unit tests for all user-defined methods that you have implemented in this package.
     */

    public static void main(String[] args) {
        EmployeeInfo employee= new EmployeeInfo("David",1,"l1","Davis@amazon.com","IT",80000);
        EmployeeInfo employeeInfo2= new EmployeeInfo("Eric ",2,"l5","Erick@amazon.com","HR",10000);

        System.out.println("Employee Id = "+employee.getEmployee_Id());
        System.out.println("Employee Name = "+employee.getEmployee_Position());
        System.out.println("Employee Position = "+employee.getEmployee_Position());
        System.out.println("Employee Email = "+employee.getEmployee_Email());
        System.out.println("Employee Department = "+employee.getEmployee_Department());
        System.out.println("Employee Salary = "+employee.getEmployee_Salary());
        // 1 is for .10 % Bonus
        // 2 is for .6% Bonus
        System.out.println("Employee Annual Bonus "+ employee.calculateAnnualBonus(80000,1));
        System.out.println("Employee Annual Pension "+ employee.calculateEmployeePension(employee.getEmployee_Salary()));
    }
}
