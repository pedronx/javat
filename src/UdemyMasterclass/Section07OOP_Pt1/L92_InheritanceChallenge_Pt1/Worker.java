package UdemyMasterclass.Section07OOP_Pt1.L92_InheritanceChallenge_Pt1;

public class Worker {

    private String name;
    private String birthDate;
    protected String enddate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", enddate='" + enddate + '\'' +
                '}';
    }

    /**
     * Calculate date of birth - format: dd/mm/yyyy
     * Returns -1 if date of birth is invalid
     * (invalid numeric date > 125, or invalid non-numeric data)
     */
    public int getAge() {
        int currentYear = 2023;
        int minimumYear = currentYear - 125;
        int dob;

        try {
                dob = Integer.parseInt(getYearOfBirth(this.birthDate));
                if (dob < minimumYear || dob > currentYear) {
                    return -1;
                }
            } catch (NumberFormatException e) {
                return -1;
            }
        return (currentYear - dob);
    }

    private String getYearOfBirth(String birthDate) {

        /*
        // Extract the year of birth (format: dd/mm/yyyy)
        // Create a new substring using a for loop and the charAt() method
        String yob = "";
        for (int i = 6; i <= 9; i++) {
            yob += birthDate.charAt(i);
        }
         */

        // Create a new substring using the substring method
        return birthDate.substring(6);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String enddate) {
        this.enddate = enddate;
    }
}
