package UdemyMasterclass.Section12Generics.L167_GenericsChallenge;

import UdemyMasterclass.Section12Generics.L164_GenericsClass_Pt1.Player;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Compares the ranking of two teams
     * @return
     *   1 if team 1 has higher ranking
     *   0 if both have similar ranking
     *   -1 if team 1 has lower ranking
     */
    @Override
    public int compareTo(Team<T> t) {
        if (this.ranking() > t.ranking()) {
            return -1;
        } else if (this.ranking() < t.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team" + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
