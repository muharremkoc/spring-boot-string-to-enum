package com.example.springbootstringtoenum.controller;

import com.example.springbootstringtoenum.enums.Hero;
import com.example.springbootstringtoenum.model.CharacterSelect;
import com.example.springbootstringtoenum.request.CharacterSelectRequest;
import com.example.springbootstringtoenum.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api",produces = "application/json")
@RequiredArgsConstructor
public class CharacterController {

    final CharacterService characterService;

    @GetMapping("/characterMenu")
    public List<CharacterSelect> findItems() {
        return characterService.characterSelectMenu();
    }

    @GetMapping("/{type}")
    public List<CharacterSelectRequest> findItemByType(@PathVariable("type") Hero hero) {
        return characterService.findCharacterByHero(hero);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CharacterSelect saveItem(@RequestBody CharacterSelectRequest item) {
        return characterService.save(item);
    }

}
