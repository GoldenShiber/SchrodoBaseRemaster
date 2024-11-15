package com.basicschrodobert.schordobert.controller;

import com.basicschrodobert.schordobert.model.RpCharacter;
import com.basicschrodobert.schordobert.repository.RpCharacterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RpCharacterController {

    private final RpCharacterRepository rpCharacterRepository;

    RpCharacterController(RpCharacterRepository rpCharacterRepository){
        this.rpCharacterRepository = rpCharacterRepository;
    }


    @GetMapping("/characters")
    List<RpCharacter> all(){
        return rpCharacterRepository.findAll();
    }

    @PutMapping("/character/{name}/{userId}")
    void create(@PathVariable String name, @PathVariable long userId){
        rpCharacterRepository.save(new RpCharacter(name, userId));
    }

}
