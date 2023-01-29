package CodeGym.Level11.L06_VrsTasks;

/**
 * Weather forecast
 * The City class has two fields — the name of the city and the current air temperature. The Solution class also has a showWeather method: it displays information about the weather of the city passed as an argument to the method. Implement the showWeather method, which should display information in the following format: Today's temperature in [city name] is [city temperature]
 * In the main method, you need to call the showWeather method once with the required argument.
 * Example output:
 * Today's temperature in Dubai is 71
 * Requirements:
 *   . Don't change the City class.
 *   . The Solution class must have a showWeather method with a City parameter.
 *   . The showWeather method must use the getters of the City class.
 *   . The showWeather method should display text on the console in accordance with the task conditions.
 */
public class MainCity {

    public static void showWeather(City city) {

        System.out.printf("Today's temperature in %s is %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {

        City city = new City("Dubai", 71);
        showWeather(city);
    }
}
