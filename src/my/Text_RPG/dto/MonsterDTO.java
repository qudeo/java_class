package my.Text_RPG.dto;

public class MonsterDTO {
    private String name;
    private int maxHp;
    private int maxMp;
    private int hp;
    private int mp;
    private int att;
    private int def;

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

    public MonsterDTO() {
    }

    public MonsterDTO(String name, int maxHp, int maxMp, int hp, int mp, int att, int def) {
        this.name = name;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.hp = hp;
        this.mp = mp;
        this.att = att;
        this.def = def;
    }
}
