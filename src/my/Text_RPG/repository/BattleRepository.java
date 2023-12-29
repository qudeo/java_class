package my.Text_RPG.repository;

import my.Text_RPG.dto.*;

import java.util.ArrayList;
import java.util.List;

public class BattleRepository {
    static List<Integer> characterDTOList = new ArrayList<Integer>();
    Monster1DTO monster1DTO = new Monster1DTO();
    Monster2DTO monster2DTO = new Monster2DTO();
    Monster25DTO monster25DTO = new Monster25DTO();
    CharacterDTO characterDTO = new CharacterDTO();
    Character2DTO character2DTO = new Character2DTO();

    public int monsterAtt() {
        int characterDTOhp = characterDTO.hp - monster1DTO.att;
        characterDTO.setHp(characterDTOhp);
        characterDTOhp = characterDTO.hp;
        return characterDTOhp;
    }

    public int CharAtt() {
        int monsterDTOhp = monster1DTO.hp - characterDTO.att;
        monster1DTO.setHp(monsterDTOhp);
        monsterDTOhp = monster1DTO.hp;
        return monsterDTOhp;
    }

    public int monsterAtt2() {
        int characterDTOhp = character2DTO.hp - monster2DTO.att;
        character2DTO.setHp(characterDTOhp);
        characterDTOhp = character2DTO.hp;
        return characterDTOhp;
    }

    public int CharAtt2() {
        int monsterDTOhp = monster2DTO.hp - character2DTO.att;
        monster2DTO.setHp(monsterDTOhp);
        monsterDTOhp = monster2DTO.hp;
        return monsterDTOhp;
    }

    public int monsterAtt3() {
        int characterDTOhp = character2DTO.hp - monster25DTO.att;
        character2DTO.setHp(characterDTOhp);
        characterDTOhp = character2DTO.hp;
        return characterDTOhp;
    }

    public int CharAtt3() {
        int monsterDTOhp = monster25DTO.hp - character2DTO.att;
        monster25DTO.setHp(monsterDTOhp);
        monsterDTOhp = monster25DTO.hp;
        return monsterDTOhp;
    }

}

