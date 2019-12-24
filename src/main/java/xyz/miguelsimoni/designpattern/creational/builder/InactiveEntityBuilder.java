package xyz.miguelsimoni.designpattern.creational.builder;

import xyz.miguelsimoni.model.Entity;

/**
 * Concrete Inactive Entity Builder.
 */
public class InactiveEntityBuilder extends AbstractEntityBuilder {

    @Override
    public Entity build() {
        Entity entity = super.build();
        entity.setActive(false);
        return entity;
    }

}
