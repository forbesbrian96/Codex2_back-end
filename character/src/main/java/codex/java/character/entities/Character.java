package codex.java.character.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.peristence.Id;

@Entity
public class Character {

    //**************************************** */
    //  Entity Properties
    //**************************************** */
    
    @Id //Denotes this property as the id/primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generates
}