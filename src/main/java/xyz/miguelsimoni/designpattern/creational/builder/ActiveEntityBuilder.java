package xyz.miguelsimoni.designpattern.creational.builder;

import xyz.miguelsimoni.model.Entity;

/**
 * Concrete Active Entity Builder.
 */
public class ActiveEntityBuilder extends AbstractEntityBuilder {

    @Override
    public Entity build() {
        Entity entity = super.build();
        entity.setActive(true);
        return entity;
    }

}
