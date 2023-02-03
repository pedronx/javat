package CodeGym.Level14.L02_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class MoreForEach {

    public static void main(String[] args) {

        /*-- Array of scores --*/
        int[] scores = {5, 10, 7, 8, 9, 9, 10, 12};

        int bestScore = getBestScore(scores);
        System.out.print("All the scores: ");
        printAllScores(scores);
        System.out.println("\nThe highest score is " + bestScore);
        System.out.println("The average score is " + getAverageScore(scores));

        System.out.println("-".repeat(15));

        /*-- Collections --*/
        List<String> names = new ArrayList<>();
        names.add("Snoopy");
        names.add("Charlie");
        names.add("Linus");
        names.add("Shroeder");
        names.add("Woodstock");

        for(String name : names){
            System.out.println(name);
        }
    }

    // A method that prints all scores
    public static void printAllScores(int[] scores) {
        System.out.print("|");
        for (int num : scores) {

            System.out.print(num + "|");
        }
        System.out.println();
    }

    // A method that displays the average score

    public static double getAverageScore(int[] numbers) {
        int totalScore = 0;

        for (int num : numbers) {
            totalScore = num + totalScore;
        }
        return ((double) totalScore / numbers.length);

    }

    // A method that determines the best (maximum) score
    public static int getBestScore(int[] numbers) {
        int maxScore = numbers[0];

        for (int num : numbers) {
            if (num > maxScore) {
                maxScore = num;
            }
        }
        return maxScore;
    }

}
