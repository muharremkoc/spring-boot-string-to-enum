package com.example.springbootstringtoenum.service;

import com.example.springbootstringtoenum.enums.Hero;
import com.example.springbootstringtoenum.model.CharacterSelect;
import com.example.springbootstringtoenum.request.CharacterSelectRequest;

import java.util.List;

public interface CharacterService {
        CharacterSelect save(CharacterSelectRequest characterSelect);
        List<CharacterSelect> characterSelectMenu();
        List<CharacterSelectRequest> findCharacterByHero(Hero hero);
}
