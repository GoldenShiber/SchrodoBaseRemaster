package com.basicschrodobert.schordobert.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

public class Character {
    private @Id @GeneratedValue long id;

    private String Name;
    private long userId;

    public Character() {
    }

    public Character(String name, long userId) {
        Name = name;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id == character.id && userId == character.userId && Objects.equals(Name, character.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, userId);
    }
}
