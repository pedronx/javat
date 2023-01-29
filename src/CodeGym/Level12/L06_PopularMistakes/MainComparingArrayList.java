package CodeGym.Level12.L06_PopularMistakes;

import java.util.*;

/**
 * We have a student group at a university and a method that should remove a specific student from the group, but for some reason it doesn't work.
 * Your task is to find the error and fix it so that the exclude method does actually remove the student.
 * Requirements:
 *   . The UniversityGroup class must have a public non-static List<String> students field.
 *   . The UniversityGroup class must have a public non-static exclude(String) method with a void return type.
 *   . The exclude method must remove the passed student from the list.
 *
 */
public class MainComparingArrayList {

    public List<String> students;

    public MainComparingArrayList() {
        students = new ArrayList<>();
        students.add("Stephan Fontaine");
        students.add("Victor Brown");
        students.add("Max Abelman");
        students.add("Nadine Nkosi");
        students.add("Aimee Blanchet");
        students.add("Nick Burns");
        students.add("Chika Tanaka");
    }

    public void exclude(String excludedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(excludedStudent)) {
                students.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        MainComparingArrayList universityGroup = new MainComparingArrayList();
        universityGroup.exclude("Victor Brown");
        universityGroup.students.forEach(System.out::println);
    }
}
