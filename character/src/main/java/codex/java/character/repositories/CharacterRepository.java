package codex.java.character.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import codex.java.character.entities.Character;

// The two types in <> are the Entity and type of the ID
public interface CharacterRepository extends JpaRepository<Character, Integer>{
    
}