package my.Text_RPG.service;

import my.Text_RPG.dto.CharacterDTO;

import java.util.ArrayList;
import java.util.List;

public class CharacterService {
CharacterDTO characterDTO = new CharacterDTO();
List<CharacterDTO> characterDTOList = new ArrayList<>();
    public void status() {
        System.out.println("== 캐릭터정보 ==");
        System.out.println("직업 : " + characterDTOList.get());
        System.out.println("레벨 : " + level + "");
    }
}
