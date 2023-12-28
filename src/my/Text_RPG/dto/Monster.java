package my.Text_RPG.dto;

import my.Text_RPG.repository.Character;

public class Monster extends Character {
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
