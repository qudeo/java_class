package my.Text_RPG.service;


import my.Text_RPG.dto.CharacterDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterService {
    List<CharacterDTO> characterDTOList = new ArrayList<>();
    CharacterDTO characterDTO = new CharacterDTO();
    public void status() {
        System.out.println("== 캐릭터 정보 ==");
        System.out.println("직업 : "+ characterDTOList.get(0).getName());
        System.out.println("레벨 : "+ characterDTO.getLevel() + "("+ characterDTO.getExp() + "/100)" );
        System.out.println("체력 : "+ characterDTO.getHp() +"/"+ characterDTO.getMaxHp());
        System.out.println("마나 : "+ characterDTO.getMp() +"/"+ characterDTO.getMaxMp());
        System.out.println("공격 : "+ characterDTO.getAtt());
        System.out.println("방어 : "+ characterDTO.getDef());
    }
}
