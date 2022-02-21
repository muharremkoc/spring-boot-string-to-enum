package com.example.springbootstringtoenum.repository;

import com.example.springbootstringtoenum.enums.Hero;
import com.example.springbootstringtoenum.model.CharacterSelect;
import com.example.springbootstringtoenum.request.CharacterSelectRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<CharacterSelect,Long> {

     CharacterSelect save(CharacterSelectRequest characterSelectRequest);
     List<CharacterSelect> findByHero(Hero hero);
}
