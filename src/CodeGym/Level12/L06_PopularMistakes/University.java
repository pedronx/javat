package CodeGym.Level12.L06_PopularMistakes;

/**
 * Making a list of students
 * The main method should add two students to an array and then display on the console using the printStudents method.
 * Make corrections in the main method so that the program works.
 * Requirements:
 *   . The University class must have a final private non-static String[] students field that is initialized immediately.
 *   . The University class should have a public void addStudent(String) method that adds the passed student to the students list.
 *   . The University class should have a public void printStudents method that prints all the students on the console.
 *   . The main method must call the addStudent method twice.
 *   . The main method must call the printStudents method once.
 */
public class University {

    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {

        University uni = new University();
        uni.addStudent("Max Feder");
        uni.addStudent("Jose Hernandez");
        uni.printStudents();
    }
}
