package UdemyMasterclass.Section11Abstraction.L161_162_InterfaceChallenge;

enum Geometry {LINE, POINT, POLYGON}
enum Color {BLACK, WHITE, RED, GREEN, BLUE}
enum PointMarkers {CIRCLE, DIAMOND, STAR, SQUARE, TRIANGLE, PUSH_PIN}
enum LineMarkers{DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
