package my.Text_RPG.dto;

import my.Text_RPG.repository.Character;

public class CharacterDTO extends Character {

    public String name = "외노자";
    public int maxHp = 30;
    public int maxMp = 30;
    public int hp = 30;
    public int mp = 30;
    public int att = 5;
    public int def = 5;
    public int level = 1;
    public int exp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public CharacterDTO() {
    }

    public CharacterDTO(String name, int maxHp, int maxMp, int hp, int mp, int att, int def, int level, int exp) {
        this.name = "외노자";
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.hp = hp;
        this.mp = mp;
        this.att = att;
        this.def = def;
        this.level = 1;
        this.exp = 0;
    }
}
