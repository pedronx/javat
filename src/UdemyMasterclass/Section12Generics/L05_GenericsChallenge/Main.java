package UdemyMasterclass.Section12Generics.L05_GenericsChallenge;

import UdemyMasterclass.Section12Generics.L02_GenericsClass_Pt1.FootballPlayer;

/**
 * Generics Challenge
 * Create a generic class to implement a league table for a sport.
 * The class should allow teams to be added to the list, and store
 * a list of teams that belong to the league.
 * >>
 * Your class should have a method to print out the teams in order,
 * with the team at the top of the league printed first.
 * >>
 * Only teams of the same type should be added to any particular
 * instance of the league class - the program should fail to compile
 * if an attempt is made to add an incompatible team.
 */
public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> primeraLiga = new League<>("Primeira Liga PT");

        Team<FootballPlayer> benfica = new Team<>("Benfica");
        Team<FootballPlayer> sporting = new Team<>("Sporting");
        Team<FootballPlayer> porto = new Team<>("Porto");
        Team<FootballPlayer> beiraMar = new Team<>("Beira Mar");
        Team<FootballPlayer> estoril = new Team<>("Estoril Praia");
        Team<FootballPlayer> realClube = new Team<>("Real Clube");

        benfica.addPlayer(new FootballPlayer("Manuel António"));
        primeraLiga.add(benfica);
        sporting.addPlayer(new FootballPlayer("Marco Horácio"));
        primeraLiga.add(sporting);
        porto.addPlayer(new FootballPlayer("Fernando Couto"));
        primeraLiga.add(porto);
        beiraMar.addPlayer(new FootballPlayer("José dos Pneus"));
        primeraLiga.add(beiraMar);
        estoril.addPlayer(new FootballPlayer("António Martins"));
        primeraLiga.add(estoril);
        realClube.addPlayer(new FootballPlayer("Bruno dos Santos"));
        primeraLiga.add(realClube);

        System.out.println("\n*- Game results -*");
        benfica.matchResult(estoril, 1, 0);
        sporting.matchResult(porto, 0, 5);
        realClube.matchResult(estoril, 3, 1);
        beiraMar.matchResult(porto, 0, 4);

        // List clubs ranking by order
        System.out.println("\n*** Ranking ***");
        primeraLiga.showLeagueTable();
    }
}
