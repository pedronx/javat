package CodeGym.Level11.L06_VrsTasks.Computer;

import java.security.Key;

public class Computer {

    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;
    private SystemUnit systemUnit;

    public Computer() {
        this(new Mouse(), new Keyboard(), new Monitor(), new SystemUnit());
    }

    public Computer (Mouse mouse, Keyboard keyboard, Monitor monitor, SystemUnit systemUnit) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.systemUnit = systemUnit;
    }


}
