package CodeGym.Level14.L06_ENum;

/**
 * Let's list the CodeGym quests
 * The CodeGymQuest enum contains a list of quests. Your task is to get an array of all its fields in the main method (use the values() method) and print the ordinal number of each of them (use the ordinal() method) on a new line.
 * Requirements:
 *   . In the main method, get a list of all the constants of the CodeGymQuest enum using the values() method.
 *   . In the main method, print the ordinal number of each field on a new line using the ordinal() method.
 */
public class MainJavaRush {

    public static void main(String[] args) {

        JavarushQuest[] quests = JavarushQuest.values();
        for (JavarushQuest quest : quests) {
            System.out.println(quest.ordinal());
        }
    }
}
