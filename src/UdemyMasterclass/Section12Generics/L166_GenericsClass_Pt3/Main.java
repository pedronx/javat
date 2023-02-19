package UdemyMasterclass.Section12Generics.L166_GenericsClass_Pt3;

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

        System.out.println("Number of players: " + adelaideCrows.numPlayers());

        System.out.println();
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println("Number of players: " + adelaideCrows.numPlayers());

        System.out.println();
        UdemyMasterclass.Section12Generics.L165_GenericsClass_Pt2.Team<SoccerPlayer> soccerTeam = new UdemyMasterclass.Section12Generics.L165_GenericsClass_Pt2.Team<>("Chelsea");
        soccerTeam.addPlayer(beckham);
        System.out.println("Number of players: " + soccerTeam.numPlayers());

        /*------------------------------------------*/
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        System.out.println("\n*- Game results -*");
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        // ranking wihout sorting the results
        System.out.println("\n*** Ranking ***");
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());

        // ranking wihout sorting the results
        System.out.println("\n*** Ranking sorted ***");
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());

        /*
        ArrayLyst<Team> teams;
        Collections.sort(teams);
         */
    }
}
