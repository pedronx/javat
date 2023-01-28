package CodeGym.Level12.L03_StaticMethods;

/**
 * Window work
 * The Window has a changeSize method, which should change the window size to the values passed to the method.
 * But if you run the program, you'll see for yourself that this method does not work. You need to fix the bugs so that the method works.
 * Requirements:
 *   . Don't change the declaration and initialization of the fields of the Window class.
 *   . The changeSize method of the Window class should change the values of the fields using the passed arguments.
 *   . Don't change the declaration of the changeSize method or the names of its parameters.
 */
public class MainWindow {

    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
