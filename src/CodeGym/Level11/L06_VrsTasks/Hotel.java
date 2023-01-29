package CodeGym.Level11.L06_VrsTasks;

/**
 * Arrange the floors correctly
 * We have an algorithm for the hotel elevator: to rise from the third floor to the sixth, you need to get to the fourth floor, then to the fifth and, finally, to the sixth.
 * But in our program, the floors are all mixed up! As a result, the Hotel class does not compile at present. Arrange the fields of the class in such a way that it compiles and the elevator runs correctly.
 * Requirements:
 *   . Do not delete, modify, or add fields to the Hotel class.
 *   . The fields of the Hotel class must be in the correct order.
 */
public class Hotel {

    public int thirdFloor = 3;
    public int fourthFloor = thirdFloor + 1;
    public int fifthFloor = fourthFloor + 1;
    public int sixthFloor = fifthFloor + 1;


}
