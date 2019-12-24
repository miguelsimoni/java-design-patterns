package xyz.miguelsimoni.designpattern.creational.factory;

import xyz.miguelsimoni.designpattern.creational.factory.exceptions.PolygonNotDefinedException;
import xyz.miguelsimoni.model.*;

public class PolygonFactory {

    public static Polygon getPolygon(PolygonType type) {
        switch (type) {
            case TRIANGLE:
                return new Triangle();
            case QUADRILATERAL:
                return new Quadrilateral();
            case PENTAGON:
                return new Pentagon();
            case HEXAGON:
                return new Hexagon();
            case HEPTAGON:
                return new Heptagon();
            case OCTAGON:
                return new Octagon();
            default:
                throw new PolygonNotDefinedException();
        }
    }

}
