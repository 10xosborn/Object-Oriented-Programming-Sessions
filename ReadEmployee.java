public class ReadEmployee{
    private final String employeeID;
    private String employeeName;
    private double salary;

    public ReadEmployee(String employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeName(String newEmployeeName){
        employeeName = newEmployeeName;
    }

    public void setSalary(double newSalary){
        salary = newSalary;
    }
   
}