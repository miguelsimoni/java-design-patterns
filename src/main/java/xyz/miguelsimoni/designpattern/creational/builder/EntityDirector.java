package xyz.miguelsimoni.designpattern.creational.builder;

import xyz.miguelsimoni.model.Entity;

/**
 * Entity Director.
 */
public class EntityDirector {

    public Entity construct() {
        Entity entity = new ActiveEntityBuilder().setId(1).setName("Default Entity").addAttribute("default")
                                                 .addAttribute("base").activated().build();
        return entity;
    }

    /**
     * Construct an active Entity.
     *
     * @return Entity with active field in true.
     */
    public Entity constructActivatedEntity() {
        Entity entity = new ActiveEntityBuilder().setId(2).setName("Active Entity").addAttribute("enabled")
                                                 .addAttribute("on").build();
        return entity;
    }

    /**
     * Construct an inactive Entity.
     *
     * @return An Entity with active field in false.
     */
    public Entity constructDeactivatedEntity() {
        Entity entity = new InactiveEntityBuilder().setId(3).setName("Inactive Entity").addAttribute("disabled")
                                                   .addAttribute("off").build();
        return entity;
    }

}
