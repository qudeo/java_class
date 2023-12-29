package my.Text_RPG.dto;

public class Monster3DTO {
    public String name = "김재희씨";
    public int maxHp = 10;
    public int maxMp;
    public int hp = 30;
    public int mp;
    public int att = 29;
    public int def;

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

    public Monster3DTO() {
    }

    public Monster3DTO(String name, int maxHp, int maxMp, int hp, int mp, int att, int def) {
        this.name = "반달가슴곰";
        this.maxHp = 10;
        this.maxMp = maxMp;
        this.hp = hp;
        this.mp = mp;
        this.att = att;
        this.def = def;
    }

}
