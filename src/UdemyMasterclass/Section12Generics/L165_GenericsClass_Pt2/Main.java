package UdemyMasterclass.Section12Generics.L165_GenericsClass_Pt2;

import UdemyMasterclass.Section12Generics.L164_GenericsClass_Pt1.BaseballPlayer;
import UdemyMasterclass.Section12Generics.L164_GenericsClass_Pt1.FootballPlayer;
import UdemyMasterclass.Section12Generics.L164_GenericsClass_Pt1.SoccerPlayer;

public class Main {

    public static void main (String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat); // Java returns error, player is from a different Team Class
//        adelaideCrows.addPlayer(beckham); // Java returns error, player is from a different Team Class

        System.out.println("Number of players: " + adelaideCrows.numPlayers());

        System.out.println();
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println("Number of players: " + adelaideCrows.numPlayers());

        System.out.println();
        Team<SoccerPlayer> soccerTeam = new Team<>("Chelsea");
        soccerTeam.addPlayer(beckham);
        System.out.println("Number of players: " + soccerTeam.numPlayers());
    }
}
