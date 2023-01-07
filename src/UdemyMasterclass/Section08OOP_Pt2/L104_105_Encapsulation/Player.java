package UdemyMasterclass.Section08OOP_Pt2.L104_105_Encapsulation;

public class Player {

    private String name;
    private int health;
    private String weapon;

    public Player(String name) {
        this(name, "Sword");
    }

    public Player(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public void loseHealth(int damage) {
        health -= damage;

        if (health <= 0) {
            System.out.println("Player knocked out of game.");
            if (health != 0) {
                health = 0;
            }
        }
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;

        if (health >= 100) {
            System.out.println("System restored to 100%");
            if (health != 100) {
                health = 100;
            }
        }
    }

    public int healthRemaining() {
        return health;
    }
}
