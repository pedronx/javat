package UdemyMasterclass.Section08OOP_Pt2.L107_Polymorphism_Pt1;

public class Main {

    public static void main(String[] args) {

        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();

        System.out.println(">>>>>>");
        Movie anotherMovie = new Adventure("Indiana Jones");
        anotherMovie.watchMovie();

        System.out.println(">>>>>>");
        Movie aDifferentMovie = new Comedy("Home Alone");
        aDifferentMovie.watchMovie();

        System.out.println(">>>>>>");
        Movie anotherDifferentMovie = new ScienceFiction("Blade Runner");
        anotherDifferentMovie.watchMovie();
    }
}
