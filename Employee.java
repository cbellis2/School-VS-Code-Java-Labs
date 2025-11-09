/**
 * Employee class that stores employee information
 */
public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    /**
     * No-arg constructor
     */
    public Employee() {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    /**
     * Constructor with parameters
     */
    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        setEmployeeNumber(employeeNumber); // Use setter for validation
        this.hireDate = hireDate;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (isValidEmployeeNumber(employeeNumber)) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException(
                "Invalid employee number format. Must be XXX-L where X is digit 0-9 and L is letter A-M");
        }
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Validates employee number format (XXX-L)
     */
    private boolean isValidEmployeeNumber(String empNumber) {
        if (empNumber == null || empNumber.length() != 5) {
            return false;
        }
        
        // Check format XXX-L
        return Character.isDigit(empNumber.charAt(0)) &&
               Character.isDigit(empNumber.charAt(1)) &&
               Character.isDigit(empNumber.charAt(2)) &&
               empNumber.charAt(3) == '-' &&
               Character.isLetter(empNumber.charAt(4)) &&
               empNumber.charAt(4) >= 'A' && empNumber.charAt(4) <= 'M';
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Employee Number: " + employeeNumber + "\n" +
               "Hire Date: " + hireDate;
    }
}