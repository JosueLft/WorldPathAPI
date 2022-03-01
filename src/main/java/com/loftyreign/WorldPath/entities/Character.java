package com.loftyreign.WorldPath.entities;

import java.io.Serializable;
import java.util.Objects;

public class Character implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String tribe;
    private String ability;

    public Character(){}

    public Character(String id, String name, String race, String ability) {
        this.id = id;
        this.name = name;
        this.tribe = race;
        this.ability = ability;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTribe() {
        return tribe;
    }
    public void setTribe(String tribe) {
        this.tribe = tribe;
    }
    public String getAbility() {
        return ability;
    }
    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id.equals(character.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}