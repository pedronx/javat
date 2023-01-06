package UdemyMasterclass.Section08OOP_Pt2.L101_Composition_Pt2;

public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theMotherboard, theCase);

        thePC.getComputerCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getMonitor().drawPixelAt(10,10, "red");

        // Personal Computer Two
        ComputerCase anotherCase = new ComputerCase("1109", "HP", "110");
        Monitor anotherMonitor = new Monitor("32inh Pro", "LG",
                32, "3640 x 1440");
        Motherboard anotherMotherboard = new Motherboard("AS1200-Pro", "Asus",
                4, 8, "v2.44");

        PersonalComputerTwo theLaptop = new PersonalComputerTwo("Aspire V", "Lenovo", anotherMonitor, anotherMotherboard, anotherCase);
        System.out.println(">>>>>>");
        theLaptop.powerUp();
    }
}