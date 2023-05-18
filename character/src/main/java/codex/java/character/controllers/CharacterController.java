package codex.java.character.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
}