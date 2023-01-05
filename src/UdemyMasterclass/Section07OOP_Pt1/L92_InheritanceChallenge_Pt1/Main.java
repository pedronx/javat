package UdemyMasterclass.Section07OOP_Pt1.L92_InheritanceChallenge_Pt1;

/**
 * Inheritance Challenge
 * <p>Create the following classes.
 * <br>For each class, create the attributes and methods shown. </p>
 * <p>Create a main method that will create SalariedEmployee and HourlyEmployee,
 * <br>and call the methods getAge, collectPay, and their own class methods</p>
 *
 * <br>
 * <p> <b>Classes diagram</b></p>
 * <pre>
 *  |---------------------------|
 *  | Worker                    |
 *  |---------------------------|
 *  | name: String              |
 *  | birthDate: String         |
 *  | enddate: String           |
 *  |---------------------------|
 *  | int getAge()              |
 *  | double collectPay()       |
 *  | terminate(String endDate) |
 *  |---------------------------|
 *            /\
 *            ||
 *  |-------------------|
 *  | Employee          |
 *  |-------------------|
 *  | employeeId: long  |
 *  | hireDate: String  |
 *  |-------------------|
 *           /\
 *           ||
 *      --------------------------------------
 *      ||                                  ||
 *  |----------------------|        |----------------------|
 *  | SalariedEmployee     |        | HourlyEmployee       |
 *  |----------------------|        |----------------------|
 *  | annualSalary: double |        | hourlySalary: double |
 *  | isRetired: boolean   |        |----------------------|
 *  |----------------------|        | getDoublePay()       |
 *  | retire()             |        |----------------------|
 *  |----------------------|
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        SalariedEmployee employeeS = new SalariedEmployee("John Doe","05/08/2000",
                 "01/01/2020", 18500.0, false);
        SalariedEmployee employeeSTwo = new SalariedEmployee("John Incorrect Birthdate","05/08/a2000",
                 "01/01/2020", 18500.0, false);
        HourlyEmployee employeeH = new HourlyEmployee("Jane Silver","18/02/1975",
                 "01/01/2023", 100.0);

        System.out.println(employeeS);
        System.out.println(employeeSTwo);
        System.out.println(employeeH);
        System.out.println(">>>>>>");
        System.out.println(employeeS.getName() + " is " + employeeS.getAge() + " old.");
        System.out.println(employeeSTwo.getName() + " is " + employeeSTwo.getAge() + " old.");
        System.out.println(employeeH.getName() + " is " + employeeH.getAge() + " old.");
        System.out.println(">>>>>>");

        employeeS.collectPay();
        employeeH.collectPay();

        employeeS.retire();
        System.out.println(employeeS.getName() + " is now retired.\n" + employeeS.toString());

        employeeH.getDoublePay();
    }
}
