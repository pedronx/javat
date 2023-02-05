package CodeGym.Level15.L06_StackTrace;

public class Dog {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;


    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();// Unhandled exception: DogIsNotReadyException
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Checking the gear!\r\n  Is the collar on? " + dog.isCollarPutOn + "\r\n  Is the leash on? "
                    + dog.isLeashPutOn + "\r\n  Is the muzzle on? " + dog.isMuzzlePutOn);
        }
    }

    public void putCollar() {

        System.out.println("The collar is on!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {

        System.out.println("The leash is on!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("The muzzle is on!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {

        System.out.println("We're getting ready for a walk!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Hooray, let's go for a walk! " + name + " is very happy!");
        } else {
            throw new DogIsNotReadyException(name + " is not ready for a walk! Check the gear!");
        }
    }
}

class DogIsNotReadyException extends Exception {

    public DogIsNotReadyException(String message) {
        super(message);
    }
}