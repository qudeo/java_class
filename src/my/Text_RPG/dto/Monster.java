package my.Text_RPG.dto;

public class Monster {
    Monster1DTO monster1DTO = new Monster1DTO();
    CharacterDTO characterDTO = new CharacterDTO();
    public int att;
    public int hp;
    public int def;
    public int exp;
    public int attack() {
        return att;
    }

}
