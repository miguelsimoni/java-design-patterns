package xyz.miguelsimoni.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Generic Entity.
 */
public class Entity {

    private int id;
    private String name;
    private Set<String> attributes;
    private boolean active;

    /**
     * Default constructor.
     */
    public Entity() {
        id = 0;
        name = "";
        attributes = new HashSet<>();
        active = true;
    }

    /**
     * All arguments constructor.
     *
     * @param id         The entity id.
     * @param name       The entity name.
     * @param attributes The entity attributes.
     * @param active     The entity active status.
     */
    public Entity(int id, String name, Set<String> attributes, boolean active) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
        this.active = active;
    }

    /**
     * @return The entity id.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The entity id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return The entity name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The entity name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return A list of attributes.
     */
    public Set<String> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes The list of attributes.
     */
    public void setAttributes(Set<String> attributes) {
        this.attributes = attributes;
    }

    /**
     * @return Id the entity is active.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active If is active or not.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Entity{" + "id=" + id + ", name='" + name + '\'' + ", attributes=" + attributes + ", active=" + active + '}';
    }

}
