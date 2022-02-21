package com.example.springbootstringtoenum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum Hero {
    SAGE("SAGE"),SOVA("SOVA"),OMEN("OMEN"),
    REYNA("REYNA"),CYPHER("CYPHER"),CHAMBER("CHAMBER");

    private final String characterName;

    Hero(String characterName) {
        this.characterName = characterName;
    }

    @JsonValue
    public String getCharacterName() {
        return characterName;
    }

   /* @JsonCreator
    public static Hero decode(final String characterName) {
        return Stream.of(Hero.values()).filter(targetEnum -> targetEnum.characterName.equals(characterName)).findFirst().orElse(null);
    }*/


}
