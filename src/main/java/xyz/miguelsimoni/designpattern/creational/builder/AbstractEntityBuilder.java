package xyz.miguelsimoni.designpattern.creational.builder;

import xyz.miguelsimoni.model.Entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Abstract Entity Builder class.
 */
public abstract class AbstractEntityBuilder implements EntityBuilder {

    protected int id;
    protected String name;
    protected Set<String> attributes;
    protected boolean active;

    public EntityBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EntityBuilder addAttribute(String attribute) {
        if (Objects.isNull(this.attributes)) {
            this.attributes = new HashSet<>();
        }
        this.attributes.add(attribute);
        return this;
    }

    public EntityBuilder removeAttribute(String attribute) {
        if (Objects.isNull(this.attributes)) {
            this.attributes = new HashSet<>();
        }
        this.attributes.remove(attribute);
        return this;
    }

    public EntityBuilder activated() {
        this.active = true;
        return this;
    }

    public EntityBuilder deactivated() {
        this.active = false;
        return this;
    }

    public Entity build() {
        Entity entity = new Entity();
        entity.setId(id);
        entity.setName(name);
        entity.setAttributes(Objects.nonNull(attributes) ? attributes : new HashSet<>());
        entity.setActive(active);
        return entity;
    }

}
