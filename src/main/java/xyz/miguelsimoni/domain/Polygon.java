package xyz.miguelsimoni.model;

public abstract class Polygon {

    protected PolygonType type;
    protected int sides;

    public Polygon(int sides) {
        this.type = PolygonType.getBySides(sides);
        this.sides = sides;
    }

    public PolygonType getType() {
        return type;
    }

    public void setType(PolygonType type) {
        this.type = type;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Polygon{" + "type=" + type + ", sides=" + sides + '}';
    }

}
