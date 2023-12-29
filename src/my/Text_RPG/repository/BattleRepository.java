package my.Text_RPG.repository;

import my.Text_RPG.dto.CharacterDTO;
import my.Text_RPG.dto.Monster1DTO;

import java.util.ArrayList;
import java.util.List;

public class BattleRepository {
    static List<Integer> characterDTOList = new ArrayList<Integer>();
    Monster1DTO monster1DTO = new Monster1DTO();
    CharacterDTO characterDTO = new CharacterDTO();

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


}

