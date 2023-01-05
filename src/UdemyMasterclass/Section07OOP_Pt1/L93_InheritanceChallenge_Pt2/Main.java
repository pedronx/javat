package UdemyMasterclass.Section07OOP_Pt1.L93_InheritanceChallenge_Pt2;

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
 *
 * <p><b>Rules</b></p>
 * <ul><li>A salaried employee is paid based on some percentage of his or her salary</li>
 *     <li>If this person is retired, then the salary may be 100%, but it is generally reduced somewhat</li>
 *     <li>An hourly employee is paid by the hours worked, and the hourly rate agreed</li>
 *     <li>An hourly employee may also get double pay, if they work a certain amount of hours</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args) {

        SalariedEmployee employeeS = new SalariedEmployee("John Doe","05/08/2000",
                 "01/01/2020", 18500.0);
        SalariedEmployee employeeSTwo = new SalariedEmployee("John Incorrect Birthdate","05/08/a2000",
                 "01/01/2020", 18500.0);
        HourlyEmployee employeeH = new HourlyEmployee("Jane Silver","18/02/1975",
                 "01/01/2023", 15.0);

        System.out.println(employeeS);
        System.out.println(employeeSTwo);
        System.out.println(employeeH);
        System.out.println(">>>>>>");
        System.out.println(employeeS.getName() + " is " + employeeS.getAge() + " old.");
        System.out.println(employeeS.getName() + "\'s paycheck = " + employeeS.collectPay() + " €");
        System.out.println(">>>>>>");
        System.out.println(employeeSTwo.getName() + " is " + employeeSTwo.getAge() + " old.");
        System.out.println(">>>>>>");
        System.out.println(employeeH.getName() + " is " + employeeH.getAge() + " old.");
        System.out.println(employeeH.getName() + "\'s paycheck (hourly) = " + employeeH.collectPay() + " €");
        System.out.println(employeeH.getName() + "\'s paycheck (double) = " + employeeH.getDoublePay() + " €");
        System.out.println(">>>>>>");

        employeeS.collectPay();
        employeeH.collectPay();

        employeeS.retire();
        System.out.println(employeeS.getName() + " is now retired.\n" + employeeS.toString());

    }
}
