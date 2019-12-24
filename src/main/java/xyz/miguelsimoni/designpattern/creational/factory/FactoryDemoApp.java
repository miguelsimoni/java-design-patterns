package xyz.miguelsimoni.designpattern.creational.factory;

import xyz.miguelsimoni.domain.Polygon;
import xyz.miguelsimoni.domain.PolygonType;

public class FactoryDemoApp {

    public static void main(String[] args) {
        System.out.println("--- Design Pattern Singleton Demo Application ---");

        Polygon triangle = PolygonFactory.getPolygon(PolygonType.TRIANGLE);
        Polygon square = PolygonFactory.getPolygon(PolygonType.QUADRILATERAL);
        Polygon hexagon = PolygonFactory.getPolygon(PolygonType.HEXAGON);

        System.out.println(triangle.toString());
        System.out.println(square.toString());
        System.out.println(hexagon.toString());
    }

}
