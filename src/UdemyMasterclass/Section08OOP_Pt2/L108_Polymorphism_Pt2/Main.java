package UdemyMasterclass.Section08OOP_Pt2.L108_Polymorphism_Pt2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie theNewMovie = Movie.getMovie("Adventure", "Willow");
        theNewMovie.watchMovie();

        Movie theNewerMovie = Movie.getMovie("Science", "Star Trek");
        theNewerMovie.watchMovie();

        System.out.println(">>>>>>\n");
        System.out.println("Welcome to Cinema City!");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Film Type (A for Adventure, C for comedy, " +
                    "S for Science Fiction, or Q to Quit): ");
            String type = s.nextLine();

            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
            break;
        }
    }
}
