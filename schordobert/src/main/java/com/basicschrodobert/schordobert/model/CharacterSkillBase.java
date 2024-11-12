package com.basicschrodobert.schordobert.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CharacterSkillBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int hp;

    private int mana;

    private int strength;

    private int charisma;

    // Physical condition
    private int condition;

    private int intelligence;

    private int willpower;

    private int dexterity;

    private int luck;

    // I am feeling a need to use a building pattern for this entity :) ...

    public CharacterSkillBase(long characterId) {
    }
}
