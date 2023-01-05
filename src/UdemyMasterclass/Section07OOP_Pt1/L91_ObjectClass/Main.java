package UdemyMasterclass.Section07OOP_Pt1.L91_ObjectClass;

public class Main extends Object { // java.lang.Object

    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carol");
        System.out.println(jimmy);
    }
}