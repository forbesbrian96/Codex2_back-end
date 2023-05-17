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
    public Integer id;

        ///////////////////////////////////////////////
        // CHARACTER DESCRIPTORS
        ///////////////////////////////////////////////


    public String characterName;

    public Integer maxHitPoints;

    public Integer currentHitPoints;

    public Integer tempHitPoints;

    public Integer AC;

    public Integer intitiative;

    public Integer speed;

    public Integer baseSpeed;

    public Integer age;

    public String height;

    public Integer weight;

    public String eyes;

    public String hair;

    public String skin;

    public String race;

    public String characterClass;

    public String alignment;

    public String background;

    public Integer experience;

    public Integer level;

    public Integer profBonus;

        ///////////////////////////////////////////////
        // Ability Scores
        ///////////////////////////////////////////////

    public Integer strScore;

    public Integer strMod;

    public Integer strMisc;

    public Integer strSave;

    public Integer dexScore;

    public Integer dexMod;

    public Integer dexMisc;

    public Integer dexSave;
    
    public Integer conScore;

    public Integer conMod;

    public Integer conMisc;

    public Integer conSave;

    public Integer intScore;

    public Integer intMod;

    public Integer intMisc;

    public Integer intSave;

    public Integer wisScore;

    public Integer wisMod;

    public Integer wisMisc;

    public Integer wisSave;

    public Integer chaScore;

    public Integer chaMod;

    public Integer chaMisc;

    public Integer chaSave;
}