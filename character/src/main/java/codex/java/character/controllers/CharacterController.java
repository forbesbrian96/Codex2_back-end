package codex.java.character.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // Get request to /character
    @GetMapping("/character")
    public List<Character> index(){
        return Characters.findAll();
    }

    /////////////////////////////////////////////////////////////////
    // SHOW
    /////////////////////////////////////////////////////////////////

    // Get request to /character/:id
    @GetMapping("/character/:id")
    public Optional<Character> show(@PathVariable Integer id){
        return Characters.findById(id);
    }
}