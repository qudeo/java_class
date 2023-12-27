package my.Text_RPG.dto;

import java.util.List;

public class CharacterDTO {
    private String name = "외노자";
    private int maxHp = 30;
    private int maxMp = 30;
    private int hp;
    private int mp;
    private int att;
    private int def;
    private int level;
    private int exp;

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
        this.name = name;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.hp = hp;
        this.mp = mp;
        this.att = att;
        this.def = def;
        this.level = level;
        this.exp = exp;
    }

}
