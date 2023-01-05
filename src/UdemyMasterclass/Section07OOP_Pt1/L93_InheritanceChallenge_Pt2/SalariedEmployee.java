package UdemyMasterclass.Section07OOP_Pt1.L93_InheritanceChallenge_Pt2;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        // isRetired is false by default
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retire() {
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        return (int) annualSalary / 26;
    }
}