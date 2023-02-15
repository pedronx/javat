package UdemyMasterclass.Section11Abstraction.L161_162_InterfaceChallenge;

import javax.sound.sampled.Line;

enum UtilityType {ELECTRICAL, FIBRE_OPTIC, GAS, WATER}

public class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType utility) {
        this.name = name;
        this.type = utility;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
            case FIBRE_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
            case GAS -> Color.BLACK + " " + LineMarkers.SOLID;
            case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
            default -> Color.WHITE + " " + LineMarkers.SOLID;
        };
    }

    // overriding the method in order to include more information
    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": %s, "utility": %s """.formatted(name, type);
    }
}
