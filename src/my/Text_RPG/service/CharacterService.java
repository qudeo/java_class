package my.Text_RPG.service;


import my.Text_RPG.dto.CharacterDTO;

import java.util.ArrayList;
import java.util.List;

public class CharacterService {
    CharacterDTO characterDTO = new CharacterDTO();
    public void status() {
        System.out.println("== 캐릭터 정보 ==");
        System.out.println("직업 : "+ characterDTO.name);
        System.out.println("레벨 : "+ characterDTO.level + "("+ characterDTO.exp+ "/100)" );
        System.out.println("체력 : "+ characterDTO.hp +"/"+ characterDTO.hp);
        System.out.println("마나 : "+ characterDTO.mp +"/"+ characterDTO.mp);
        System.out.println("공격 : "+ characterDTO.att);
        System.out.println("방어 : "+ characterDTO.def);
        System.out.println("상태이상 : 쇠약");
        System.out.println("쇠약 : 전투가 끝난 후 최대체력으로 회복합니다." +
                "하지만, 그외 모든 능력치는 고정됩니다.");
    }
}
