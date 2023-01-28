package CodeGym.Level11.L04_GettersAndSetters;

/**
 * Salary
 * We have a Programmer class, which has a very important salary field. Our task is as follows: we need to add the ability to get and change the value of this field using a getter and a setter.
 * But there is a nuance here: the salary can only be increased. Accordingly, you need make the setter perform a check: if the value of the parameter is greater than the current value, then change the salary field. Otherwise, ignore the parameter.
 * Requirements:
 *   . The Programmer class must have a private int salary field that is not static.
 *   . The Programmer class must have a public getter for the salary field.
 *   . The Programmer class must have a public setter for the salary field.
 *   . The setter should only change the value of the salary field if the input parameter is greater than the current value.
 */
public class Programmer {

    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
