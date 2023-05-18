package codex.java.character.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import codex.java.character.repositories.CharacterRepository;
import codex.java.character.entities.Character;

@RestController
public class CharacterController {

    // Property to hold Character Repository
    public CharacterRepository Characters;

    // Receive Character Repository via Dependency Injection
    public CharacterController(CharacterRepository Characters){
        this.Characters = Characters;
    }

    /////////////////////////////////////////////////////////////////
    // INDEX
    /////////////////////////////////////////////////////////////////

    // Get request to /characters
    @GetMapping("/characters")
    public List<Character> index(){
        return Characters.findAll();
    }

    /////////////////////////////////////////////////////////////////
    // SHOW
    /////////////////////////////////////////////////////////////////

    // Get request to /character/:id
    @GetMapping("/characters/:id")
    public Optional<Character> show(@PathVariable Integer id){
        return Characters.findById(id);
    }

    /////////////////////////////////////////////////////////////////
    // CREATE
    /////////////////////////////////////////////////////////////////

    // Post request to /characters
    @PostMapping("/characters")
    public List<Character> create(@RequestBody Character newCharacter){
        Characters.save(newCharacter); // Create the new Character
        return Characters.findAll();
    }

    /////////////////////////////////////////////////////////////////
    // UPDATE
    /////////////////////////////////////////////////////////////////

    // Put request to /characters/{id}
    @PutMapping("/characters/{id}")
    public List<Character> update(@RequestBody Character fixCharacter, @PathVariable Integer id){
        // Find character by it's id then use map to update it
        Characters.findById(id).map(character -> {

            character.setCharacterName(fixCharacter.getCharacterName());
            character.setMaxHitPoints(fixCharacter.getMaxHitPoints());
            character.setCurrentHitPoints(fixCharacter.getCurrentHitPoints());
            character.setTempHitPoints(fixCharacter.getTempHitPoints());
            character.setAC(fixCharacter.getAC());
            character.setInitiative(fixCharacter.getInitiative());
            character.setSpeed(fixCharacter.getSpeed());
            character.setBaseSpeed(fixCharacter.getBaseSpeed());
            character.setAge(fixCharacter.getAge());
            character.setHeight(fixCharacter.getHeight());
            character.setWeight(fixCharacter.getWeight());
            character.setEyes(fixCharacter.getEyes());
            character.setHair(fixCharacter.getHair());
            character.setSkin(fixCharacter.getSkin());
            character.setRace(fixCharacter.getRace());
            character.setCharacterClass(fixCharacter.getCharacterClass());
            character.setAlignment(fixCharacter.getAlignment());
            character.setBackground(fixCharacter.getBackground());
            character.setExperience(fixCharacter.getExperience());
            character.setLevel(fixCharacter.getLevel());
            character.setProfBonus(fixCharacter.getProfBonus());
            character.setStrScore(fixCharacter.getStrScore());
            character.setStrMod(fixCharacter.getStrMod());
            character.setStrMisc(fixCharacter.getStrMisc());
            character.setStrSave(fixCharacter.getStrSave());
            character.setDexScore(fixCharacter.getDexScore());
            character.setDexMod(fixCharacter.getDexMod());
            character.setDexMisc(fixCharacter.getDexMisc());
            character.setDexSave(fixCharacter.getDexSave());
            character.setConScore(fixCharacter.getConScore());
            character.setConMod(fixCharacter.getConMod());
            character.setConMisc(fixCharacter.getConMisc());
            character.setConSave(fixCharacter.getConSave());
            character.setIntScore(fixCharacter.getIntScore());
            character.setIntMod(fixCharacter.getIntMod());
            character.setIntMisc(fixCharacter.getIntMisc());
            character.setIntSave(fixCharacter.getIntSave());
            character.setWisScore(fixCharacter.getWisScore());
            character.setWisMod(fixCharacter.getWisMod());
            character.setWisMisc(fixCharacter.getWisMisc());
            character.setWisSave(fixCharacter.getWisSave());
            character.setChaScore(fixCharacter.getChaScore());
            character.setChaMod(fixCharacter.getChaMod());
            character.setChaMisc(fixCharacter.getChaMisc());
            character.setChaSave(fixCharacter.getChaSave());
            character.setAcrobatics(fixCharacter.getAcrobatics());
            character.setAnimalHandling(fixCharacter.getAnimalHandling());
            character.setArcana(fixCharacter.getArcana());
            character.setAthletics(fixCharacter.getAthletics());
            character.setDeception(fixCharacter.getDeception());
            character.setHistory(fixCharacter.getHistory());
            character.setInsight(fixCharacter.getInsight());
            character.setIntimidation(fixCharacter.getIntimidation());
            character.setInvestigation(fixCharacter.getInvestigation());
            character.setMedicine(fixCharacter.getMedicine());
            character.setNature(fixCharacter.getNature());
            character.setPerception(fixCharacter.getPerception());
            character.setPerformance(fixCharacter.getPerformance());
            character.setPersuasion(fixCharacter.getPersuasion());
            character.setReligion(fixCharacter.getReligion());
            character.setSleightOfHand(fixCharacter.getSleightOfHand());
            character.setStealth(fixCharacter.getStealth());
            character.setSurvival(fixCharacter.getSurvival());
            character.setLanguages(fixCharacter.getLanguages());
            character.setProficiencies(fixCharacter.getProficiencies());

            Characters.save(character);
            
            return character;
        });
        
        // Return all Characters
        return Characters.findAll();
}

    /////////////////////////////////////////////////////////////////
    // DESTROY
    /////////////////////////////////////////////////////////////////

    // Delete request to /characters/{id}
    @DeleteMapping("/characters/{id}")
    public List<Character> destroy(@PathVariable Integer id){
        Characters.deleteById(id);
        return Characters.findAll();
    }
}