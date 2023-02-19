package UdemyMasterclass.Section12Generics.L164_GenericsClass_Pt1;

public class Main {

    public static void main (String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println("\nNumber of players: " + adelaideCrows.numPlayers());
    }
}
