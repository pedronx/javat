package UdemyMasterclass.Section11Abstraction.L161_162_InterfaceChallenge;

/**
 * Interface Challenge
 * In this challenge, we'll be working on creating a mappable output.
 * The result of your code, will be text that could be printed out to a file,
 * for exchanging data with a mapping application.
 * One such file is a specially formatted file, called geojson,
 * which is a JSON file extended for georgraphical elements.
 * ---------------------------------------------------------
 * For this challenge, you'll simply create a String fo every feature that will be mapped.
 *      "properties": {"name": "Sydney Opera House", "usage": "Entertainment"}
 * ---------------------------------------------------------
 * First, create a Mappable Interface.
 * The interface should force classes to implement three methods.
 *   . One method should return a label (how the item will be dscribed in the map)
 *   . One should return a geometry type (POINT OR LINE) which is what the type will look like on the map.
 *   . The last should return an icon type (sometimes called a map marker).
 * In addition, the interface should also include:
 *   . A constant String value calle JSON_PROPERTY, which is equal to: "propoerties":{%s}.
 *     A hint, using a text block will help maintain marks in your output.
 *   . Include a default method called toJSON() that prints out the type, label and marker.
 *   . A static method, that takes a Mappable instance as an argument.
 *     This method should print out the properties for each mappable type,
 *     including those mentioned above, but also any other fields on the business classes.
 * Also create two classes that implement this interface, a Building and UtilityLine.
 *   . One class, the Building, should have a geometry type of POINT,
 *     and One class should have a geometry type of LINE (UtilityLine).
 * Your final output should look something like this:
 * (BUILDING)
 * "properties": {"type": "POINT", "label": "Sydney Town Hall (GOVERNMENT)",
 *                "marker": "RED STAR", "name": "Sydney Town Hall", "usage": "GOVERNMENT"}
 * (UTILITY LINE)
 * "properties": {"type": "LINE", "label": "College St (FIBER OPTIC)",
 *                "marker": "GREEN DOTTED", "name": "College St", "utility": "FIBER_OPTIC"}
 */
public class Main {
}
