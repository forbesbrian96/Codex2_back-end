package codex.java.character.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {

    // **************************************** */
    // Entity Properties
    // **************************************** */

    @Id // Denotes this property as the id/primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // auto generates
    public Integer id;

    ///////////////////////////////////////////////
    // CHARACTER DESCRIPTORS
    ///////////////////////////////////////////////

    public String characterName;

    public Integer maxHitPoints;

    public Integer currentHitPoints;

    public Integer tempHitPoints;

    public Integer AC;

    public Integer initiative;

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

    ///////////////////////////////////////////////
    // Skills
    ///////////////////////////////////////////////

    public Integer acrobatics;

    public Integer animalHandling;

    public Integer arcana;

    public Integer athletics;

    public Integer deception;

    public Integer history;

    public Integer insight;

    public Integer intimidation;

    public Integer investigation;

    public Integer medicine;

    public Integer nature;

    public Integer perception;

    public Integer performance;

    public Integer persuasion;

    public Integer religion;

    public Integer sleightOfHand;

    public Integer stealth;

    public Integer survival;

    ///////////////////////////////////////////////
    // Languages and Proficiencies
    ///////////////////////////////////////////////

    public String languages;

    public String proficiencies;

    // **************************************** */
    // Constructors
    // **************************************** */

    public Character() {
        // Default Constructor
    }

    public Character(String characterName, Integer maxHitPoints, Integer currentHitPoints, Integer tempHitPoints,
            Integer AC, Integer initiative, Integer speed, Integer baseSpeed, Integer age, String height,
            Integer weight, String eyes, String hair, String skin, String race, String characterClass, String alignment,
            String background, Integer experience, Integer level, Integer profBonus, Integer strScore, Integer strMod,
            Integer strMisc, Integer strSave, Integer dexScore, Integer dexMod, Integer dexMisc, Integer dexSave,
            Integer conScore, Integer conMod, Integer conMisc, Integer conSave, Integer intScore, Integer intMod,
            Integer intMisc, Integer intSave, Integer wisScore, Integer wisMod, Integer wisMisc, Integer wisSave,
            Integer chaScore, Integer chaMod, Integer chaMisc, Integer chaSave, Integer acrobatics,
            Integer animalHandling, Integer arcana, Integer athletics, Integer deception, Integer history,
            Integer insight, Integer intimidation, Integer investigation, Integer medicine, Integer nature,
            Integer perception, Integer performance, Integer persuasion, Integer religion, Integer sleightOfHand,
            Integer stealth, Integer survival, String languages, String proficiencies) {
        this.characterName = characterName;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.tempHitPoints = tempHitPoints;
        this.AC = AC;
        this.initiative = initiative;
        this.speed = speed;
        this.baseSpeed = baseSpeed;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyes = eyes;
        this.hair = hair;
        this.skin = skin;
        this.race = race;
        this.characterClass = characterClass;
        this.alignment = alignment;
        this.background = background;
        this.experience = experience;
        this.level = level;
        this.profBonus = profBonus;
        this.strScore = strScore;
        this.strMod = strMod;
        this.strMisc = strMisc;
        this.strSave = strSave;
        this.dexScore = dexScore;
        this.dexMod = dexMod;
        this.dexMisc = dexMisc;
        this.dexSave = dexSave;
        this.conScore = conScore;
        this.conMod = conMod;
        this.conMisc = conMisc;
        this.conSave = conSave;
        this.intScore = intScore;
        this.intMod = intMod;
        this.intMisc = intMisc;
        this.intSave = intSave;
        this.wisScore = wisScore;
        this.wisMod = wisMod;
        this.wisMisc = wisMisc;
        this.wisSave = wisSave;
        this.chaScore = chaScore;
        this.chaMod = chaMod;
        this.chaMisc = chaMisc;
        this.chaSave = chaSave;
        this.acrobatics = acrobatics;
        this.animalHandling = animalHandling;
        this.arcana = arcana;
        this.athletics = athletics;
        this.deception = deception;
        this.history = history;
        this.insight = insight;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.medicine = medicine;
        this.nature = nature;
        this.perception = perception;
        this.performance = performance;
        this.persuasion = persuasion;
        this.religion = religion;
        this.sleightOfHand = sleightOfHand;
        this.stealth = stealth;
        this.survival = survival;
        this.languages = languages;
        this.proficiencies = proficiencies;
    }

    // **************************************** */
    // Getters and Setters
    // **************************************** */

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Integer getMaxHitPoints() {
        return this.maxHitPoints;
    }

    public void setMaxHitPoints(Integer maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public Integer getCurrentHitPoints() {
        return this.currentHitPoints;
    }

    public void setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public Integer getTempHitPoints() {
        return this.tempHitPoints;
    }

    public void setTempHitPoints(Integer tempHitPoints) {
        this.tempHitPoints = tempHitPoints;
    }

    public Integer getAC() {
        return this.AC;
    }

    public void setAC(Integer AC) {
        this.AC = AC;
    }

    public Integer getInitiative() {
        return this.initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getBaseSpeed() {
        return this.baseSpeed;
    }

    public void setBaseSpeed(Integer baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getEyes() {
        return this.eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return this.characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getAlignment() {
        return this.alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getBackground() {
        return this.background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Integer getExperience() {
        return this.experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProfBonus() {
        return this.profBonus;
    }

    public void setProfBonus(Integer profBonus) {
        this.profBonus = profBonus;
    }

    public Integer getStrScore() {
        return strScore;
    }

    public void setStrScore(Integer strScore) {
        this.strScore = strScore;
    }

    public Integer getStrMod() {
        return strMod;
    }

    public void setStrMod(Integer strMod) {
        this.strMod = strMod;
    }

    public Integer getStrMisc() {
        return strMisc;
    }

    public void setStrMisc(Integer strMisc) {
        this.strMisc = strMisc;
    }

    public Integer getStrSave() {
        return strSave;
    }

    public void setStrSave(Integer strSave) {
        this.strSave = strSave;
    }

    public Integer getDexScore() {
        return dexScore;
    }

    public void setDexScore(Integer dexScore) {
        this.dexScore = dexScore;
    }

    public Integer getDexMod() {
        return dexMod;
    }

    public void setDexMod(Integer dexMod) {
        this.dexMod = dexMod;
    }

    public Integer getDexMisc() {
        return dexMisc;
    }

    public void setDexMisc(Integer dexMisc) {
        this.dexMisc = dexMisc;
    }

    public Integer getDexSave() {
        return dexSave;
    }

    public void setDexSave(Integer dexSave) {
        this.dexSave = dexSave;
    }

    public Integer getConScore() {
        return conScore;
    }

    public void setConScore(Integer conScore) {
        this.conScore = conScore;
    }

    public Integer getConMod() {
        return conMod;
    }

    public void setConMod(Integer conMod) {
        this.conMod = conMod;
    }

    public Integer getConMisc() {
        return conMisc;
    }

    public void setConMisc(Integer conMisc) {
        this.conMisc = conMisc;
    }

    public Integer getConSave() {
        return conSave;
    }

    public void setConSave(Integer conSave) {
        this.conSave = conSave;
    }

    public Integer getIntScore() {
        return intScore;
    }

    public void setIntScore(Integer intScore) {
        this.intScore = intScore;
    }

    public Integer getIntMod() {
        return intMod;
    }

    public void setIntMod(Integer intMod) {
        this.intMod = intMod;
    }

    public Integer getIntMisc() {
        return intMisc;
    }

    public void setIntMisc(Integer intMisc) {
        this.intMisc = intMisc;
    }

    public Integer getIntSave() {
        return intSave;
    }

    public void setIntSave(Integer intSave) {
        this.intSave = intSave;
    }

    public Integer getWisScore() {
        return wisScore;
    }

    public void setWisScore(Integer wisScore) {
        this.wisScore = wisScore;
    }

    public Integer getWisMod() {
        return wisMod;
    }

    public void setWisMod(Integer wisMod) {
        this.wisMod = wisMod;
    }

    public Integer getWisMisc() {
        return wisMisc;
    }

    public void setWisMisc(Integer wisMisc) {
        this.wisMisc = wisMisc;
    }

    public Integer getWisSave() {
        return wisSave;
    }

    public void setWisSave(Integer wisSave) {
        this.wisSave = wisSave;
    }

    public Integer getChaScore() {
        return chaScore;
    }

    public void setChaScore(Integer chaScore) {
        this.chaScore = chaScore;
    }

    public Integer getChaMod() {
        return chaMod;
    }

    public void setChaMod(Integer chaMod) {
        this.chaMod = chaMod;
    }

    public Integer getChaMisc() {
        return chaMisc;
    }

    public void setChaMisc(Integer chaMisc) {
        this.chaMisc = chaMisc;
    }

    public Integer getChaSave() {
        return chaSave;
    }

    public void setChaSave(Integer chaSave) {
        this.chaSave = chaSave;
    }

    public Integer getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Integer acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Integer getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(Integer animalHandling) {
        this.animalHandling = animalHandling;
    }

    public Integer getArcana() {
        return arcana;
    }

    public void setArcana(Integer arcana) {
        this.arcana = arcana;
    }

    public Integer getAthletics() {
        return athletics;
    }

    public void setAthletics(Integer athletics) {
        this.athletics = athletics;
    }

    public Integer getDeception() {
        return deception;
    }

    public void setDeception(Integer deception) {
        this.deception = deception;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getInsight() {
        return insight;
    }

    public void setInsight(Integer insight) {
        this.insight = insight;
    }

    public Integer getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Integer intimidation) {
        this.intimidation = intimidation;
    }

    public Integer getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Integer investigation) {
        this.investigation = investigation;
    }

    public Integer getMedicine() {
        return medicine;
    }

    public void setMedicine(Integer medicine) {
        this.medicine = medicine;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Integer getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(Integer persuasion) {
        this.persuasion = persuasion;
    }

    public Integer getReligion() {
        return religion;
    }

    public void setReligion(Integer religion) {
        this.religion = religion;
    }

    public Integer getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(Integer sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getSurvival() {
        return survival;
    }

    public void setSurvival(Integer survival) {
        this.survival = survival;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }
}