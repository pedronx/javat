package UdemyMasterclass.Section11Abstraction.L161_162_InterfaceChallenge;


enum UsageType {BUSINESS, ENTRETAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTRETAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.SQUARE;
            case SPORTS -> Color.BLACK + " " + PointMarkers.PUSH_PIN;
            default -> Color.WHITE + " " + PointMarkers.CIRCLE;
        };
    }

    // overriding the method in order to include more information
    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": %s, "usage": %s """.formatted(name, usage);
    }
}
