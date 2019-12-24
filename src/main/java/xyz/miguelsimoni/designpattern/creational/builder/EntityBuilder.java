package xyz.miguelsimoni.designpattern.creational.builder;

import xyz.miguelsimoni.domain.Entity;

/**
 * Entity Builder Interface.
 */
public interface EntityBuilder {

    EntityBuilder setId(int id);

    EntityBuilder setName(String name);

    EntityBuilder addAttribute(String attribute);

    EntityBuilder removeAttribute(String attribute);

    EntityBuilder activated();

    EntityBuilder deactivated();

    Entity build();

}
