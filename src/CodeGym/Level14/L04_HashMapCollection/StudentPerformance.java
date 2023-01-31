package CodeGym.Level14.L04_HashMapCollection;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * Student performance
 * The Solution class declares a HashMap<String, Double> grades field, whose key is the student's full name, and whose value is the student's average grade. Your task is to implement the addStudents method, which will add 5 students together with their average grade to the grades collection.
 * You can choose any values.
 * Requirements:
 *   . In the Solution class, you need to initialize a public static HashMap<String, Double> grades field.
 *   . The Solution class must have a public static addStudents method with a void return type.
 *   . The addStudents method should add 5 students and their average grade to the grades field.
 */
public class StudentPerformance {

    public static HashMap<String, Double> grades_1 = new HashMap<>();
    public static HashMap<String, Double> grades_2 = new HashMap<>();
    public static HashMap<String, Double> grades_3 = new HashMap<>();

    public static void main(String[] args) {
        addStudents_1();
        System.out.println(grades_1);

        System.out.println("-".repeat(15));

        addStudents_2();
        System.out.println("Student list: ");
        printStudents();
        System.out.printf("Average grade: %.2f %n", getAverageMark());

        System.out.println("-".repeat(15));

        addStudents_3();
        System.out.println("Student list: Name / Average grade");
        printStudentsInfo();

    }

    public static void addStudents_1() {
        grades_1.put("John", 16.0);
        grades_1.put("Silver", 12.5);
        grades_1.put("Rebecca", 17.0);
        grades_1.put("Olivia", 12.0);
        grades_1.put("Anna", 16.0);
    }

    public static void addStudents_2() {
        grades_2.put("William Butler Yeats", 4.3d);
        grades_2.put("Emily Dickenson", 4.1d);
        grades_2.put("William Shakespeare", 4.9d);
        grades_2.put("Maya Angelou", 3.7d);
        grades_2.put("Shel Silverstein", 3.2d);
    }

    public static void printStudents() {
        for (String key : grades_2.keySet()) {
            Double value = grades_2.get(key);
            System.out.printf("%s --> %.2f %n", key, value); // display average with 2 decimal places
        }
    }

    public static Double getAverageMark() {
        Double average = 0.0;
        for (String key : grades_2.keySet()) {
            Double value = grades_2.get(key);
            average += value;
        }
        return average/grades_2.size();
    }

    public static void addStudents_3() {
        grades_3.put("Walt Whitman", 4.3d);
        grades_3.put("Emily Dickenson", 4.1d);
        grades_3.put("William Shakespeare", 4.9d);
        grades_3.put("Maya Angelou", 3.7d);
        grades_3.put("Shel Silverstein", 3.2d);
    }

    public static void printStudentsInfo() {
        for(var pair: grades_3.entrySet())
        {
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
