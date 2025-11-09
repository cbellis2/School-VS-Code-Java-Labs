public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    public Employee() {
        this.name = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }

    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmployee Number: " + employeeNumber + "\nHire Date: " + hireDate;
    }
}