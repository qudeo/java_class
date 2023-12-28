package my.Text_RPG.repository;

import my.Text_RPG.dto.CharacterDTO;
import my.Text_RPG.dto.Monster1DTO;

import java.util.ArrayList;
import java.util.List;

public class BattleRepository {
    List<Integer> characterDTOList = new ArrayList<Integer>();
    Monster1DTO monster1DTO = new Monster1DTO();
    CharacterDTO characterDTO = new CharacterDTO();
    public void monsterAtt() {
        int characterDTOhp = characterDTO.hp - monster1DTO.att;
        for (int i = 0; i < characterDTOList.size(); i++) {
            if (characterDTOList.add(characterDTOhp)) {
            }
        }
        System.out.println(characterDTOhp + "가 되었습니다.");
    }
}
