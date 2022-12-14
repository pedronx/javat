package UdemyMasterclass.Section07OOP_Pt1.L93_InheritanceChallenge_Pt2;

public class Employee extends Worker {

    private long employeeId;
    private String hireDate;
    private static long employeeNo = 1001;

    public Employee() {

    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
