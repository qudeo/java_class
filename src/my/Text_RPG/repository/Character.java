package my.Text_RPG.repository;

public class Character {
    public int hp;
    public int mp;
    public int level;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character() {
    }

    public Character(int hp, int mp, int level) {
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    @Override
    public String toString() {
        return "CharacterRepository{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", level=" + level +
                '}';
    }
}
