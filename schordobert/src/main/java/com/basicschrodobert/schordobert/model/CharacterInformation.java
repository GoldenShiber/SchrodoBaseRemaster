package com.basicschrodobert.schordobert.model;

import com.basicschrodobert.schordobert.races.Race;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CharacterInformation {

    // required parameters
    @Id
    private final long charId;

    private final Race race;

    // Optimal parameters
    private final int age;
    private final int height;
    private final int weight;
    private String description;

    public long getCharId(){
        return charId;
    }

    public Race getRace(){
        return race;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }


    private CharacterInformation(CharacterInformationBuilder builder){
        this.charId = builder.charId;
        this.race = builder.race;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }
    // Builder Class
    public static class CharacterInformationBuilder{
        //required parameters
        private final long charId;

        private final Race race;

        // Optimal parameters
        private int age;
        private int height;
        private int weight;
        private String description;

        public CharacterInformationBuilder(long charId, Race race){
            this.charId = charId;
            this.race = race;
        }

        public CharacterInformationBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public CharacterInformationBuilder setHeight(int height){
            this.height = height;
            return this;
        }

        public CharacterInformationBuilder setWeight(int weight){
            this.weight = weight;
            return this;
        }
        public CharacterInformation build(){
            return new CharacterInformation(this);
        }
    }
}
