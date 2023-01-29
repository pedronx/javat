package CodeGym.Level13.L07_Generics;

import java.util.ArrayList;

/**
 * Generics and students
 * The UniversityDepartment class has a printStudentNames(ArrayList) method, which takes a list of objects and displays their names. But at present the program won't compile.
 * Your task is to fix this bug. To do this, you need to correct the signature of the printStudentNames(ArrayList) method so that it only accepts a list of Student objects (use a generic type).
 * The main method is not checked.
 * Requirements:
 *   . Correct the signature of the printStudentNames method so that it only accepts a list of students.
 *   . Do not change the implementation of the printStudentNames method.
 */
public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Anthony"));
        students.add(new Student("Lanie"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
