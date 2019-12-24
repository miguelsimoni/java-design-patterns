package xyz.miguelsimoni.domain;

public enum PolygonType {

    TRIANGLE(3, "Triangle"),
    QUADRILATERAL(4, "Quadrilateral"),
    PENTAGON(5, "Pentagon"),
    HEXAGON(6, "Hexagon"),
    HEPTAGON(7, "Heptagon"),
    OCTAGON(8, "Octagon");

    private int sides;
    private String name;

    PolygonType(int sides, String name) {
        this.sides = sides;
        this.name = name;
    }

    public static PolygonType getBySides(int sides) {
        for (PolygonType type : PolygonType.values()) {
            if (type.sides == sides) {
                return type;
            }
        }
        return null;
    }

}
