package CodeGym.Level12.L04_StaticClasses;

/**
 * The engine — the heart of the car
 * An engine is a complex mechanism. No ordinary variable is adequate to describe it.
 * In the Car class, create an inner Engine class. In the Engine class, create a boolean isRunning field that is true if the engine is running, and false otherwise. Also, add start and stop methods to this class. They will start/stop the engine (assigning the appropriate value to the isRunning field).
 * To use the engine, create an Engine engine field in the Car class.
 * Requirements:
 *   . You need to create an inner Engine class in the Car class.
 *   . The Engine class must have a private boolean isRunning field.
 *   . The Engine class must have a public void start method that sets the isRunning field to true.
 *   . The Engine class must have a public void stop method that sets the isRunning field to false.
 *   . There must be an Engine engine field in the Car class.
 */
public class Car {

    private Engine engine;

    public class Engine {

        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }
    }
}
