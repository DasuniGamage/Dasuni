public class Employee {
    private int salary = 40000;
    private int employeeId;
    private String empName;
    private String designation;
    private int age;
    private String contactNumber;

    // constructor for another salary amount
    public Employee(int employeeId, String empName, String designation, int age, String contactNumber, int salary) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.designation = designation;
        this.age = age;
        this.contactNumber = contactNumber;
        this.salary = salary;
    }

    // constructor for default salary amount
    public Employee(int employeeId, String empName, String designation, int age, String contactNumber) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.designation = designation;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    // printing employee details method
    public void showEmployeeDetails() {
        System.out.println("Employee id = " + employeeId);
        System.out.println("Employee Name = " + empName);
        System.out.println("Designation = " + designation);
        System.out.println("Age = " + age);
        System.out.println("Contact Number = " + contactNumber);
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {

        // creation of objects and assigning values
        Employee employeeA = new Employee(1101, "S.D.Pabasara", "HR Specialist", 30, "0774934323", 60000);
        Employee employeeB = new Employee(1200, "A.L. Hashini", "HR Assistant", 28, "0715687643");

        // printing detials using method
        employeeA.showEmployeeDetails();
        System.out.println("");
        employeeB.showEmployeeDetails();

    }

}