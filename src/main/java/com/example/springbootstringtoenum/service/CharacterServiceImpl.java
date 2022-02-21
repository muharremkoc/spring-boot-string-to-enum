package com.example.springbootstringtoenum.service;

import com.example.springbootstringtoenum.enums.Hero;
import com.example.springbootstringtoenum.model.CharacterSelect;
import com.example.springbootstringtoenum.repository.CharacterRepository;
import com.example.springbootstringtoenum.request.CharacterSelectRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CharacterServiceImpl implements CharacterService{

    final CharacterRepository characterRepository;

    @Override
    public CharacterSelect save(CharacterSelectRequest characterSelectRequest) {
        CharacterSelect characterSelect = new CharacterSelect();
        BeanUtils.copyProperties(characterSelectRequest, characterSelect);
        return characterRepository.save(characterSelect);
    }

    @Override
    public List<CharacterSelect> characterSelectMenu() {

        return characterRepository.findAll();
    }

    @Override
    public List<CharacterSelectRequest> findCharacterByHero(Hero hero) {
        List<CharacterSelect> entityList = characterRepository.findByHero(hero);
        List<CharacterSelectRequest> results = new ArrayList<>();
        for (CharacterSelect itemEntity : entityList) {
            CharacterSelectRequest model = new CharacterSelectRequest();
            BeanUtils.copyProperties(itemEntity, model);
            results.add(model);
        }
        return results;
    }
}
