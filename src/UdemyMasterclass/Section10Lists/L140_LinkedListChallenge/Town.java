package UdemyMasterclass.Section10Lists.L140_LinkedListChallenge;

public class Town {

    private String townName;
    private int distanceFromStart;

    public Town(String townName, int distanceFromStart) {
        this.townName = townName;
        this.distanceFromStart = distanceFromStart;
    }

    @Override public String toString() {
        return String.format("%s (%d)", townName, distanceFromStart);
    }

    public String getTownName() {
        return townName;
    }

    public int getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }
}
