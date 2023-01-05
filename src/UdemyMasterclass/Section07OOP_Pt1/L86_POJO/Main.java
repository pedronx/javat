package UdemyMasterclass.Section07OOP_Pt1.L86_POJO;

/**
 * Student Table
 * | Id          |
 * | Name        |
 * | DateOfBirth |
 * | ClassList   |
 * ---------------
 *
 */
public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        for (int i = 1; i <= 5; i++) {
            s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");

            System.out.println(s);
        }

        System.out.println(">>>>>>");
        printStudent(s);

        System.out.println(">>>>>>");
        System.out.println(s.toString());

        System.out.println(">>>>>>");
        System.out.println(s); // Java calls the toString() method by default, if it exists
    }

    public static void printStudent(Student s) {

        System.out.println("Id : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("Date of Birth: " + s.getDateOfBirth());
        System.out.println("Class List: " + s.getClassList());
    }
}
