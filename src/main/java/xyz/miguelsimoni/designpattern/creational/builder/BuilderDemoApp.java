package xyz.miguelsimoni.designpattern.creational.builder;

import xyz.miguelsimoni.model.Entity;

/**
 * Builder Design Pattern Demo Application.
 */
public class BuilderDemoApp {

    public static void main(String[] args) {
        System.out.println("--- Design Pattern Builder Demo App ---");

        EntityDirector director = new EntityDirector();

        Entity defaultEntity = director.construct();
        Entity activeEntity = director.constructActivatedEntity();
        Entity inactiveEntity = director.constructDeactivatedEntity();

        System.out.println(defaultEntity.toString());
        System.out.println(activeEntity.toString());
        System.out.println(inactiveEntity.toString());
    }

}
