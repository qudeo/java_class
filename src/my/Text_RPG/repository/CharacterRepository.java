package my.Text_RPG.repository;

import my.Text_RPG.dto.CharacterDTO;

import java.awt.*;

public class CharacterRepository {
    CharacterDTO characterDTO = new CharacterDTO();

            System.out.println("== 캐릭터 정보 ==");
        System.out.println("직업 : "+ name);
        System.out.println("레벨 : "+ level + "("+ exp + "/100)" );
        System.out.println("체력 : "+ hp +"/"+ maxHp);
        System.out.println("마나 : "+ mp +"/"+ maxMp);
        System.out.println("공격 : "+ att);
        System.out.println("방어 : "+ def);
    public void attack (Character c) {
        int damage = characterDTO.getAtt() -c.;
        damage = damage <= 0 ? 1 : damage;
        c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
        System.out.println(name + "(이)가 " + c.name + "에게"
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println(c.name + "의 현재 HP : "+ c.hp);
    }

    public void attack (Monster m) {
        int damage = att -m.def;
        damage = damage <= 0 ? 1 : damage;
        m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
        System.out.println(name + "(이)가 " + m.name + "에게"
                + damage + "만큼 데미지를 주었습니다.");
        System.out.println(m.name + "의 현재 HP : "+ m.hp);
    }

    public void getExp (int exp) {
        System.out.println(exp + "경험치를 획득하였습니다.");
        this.exp += exp;
        while (100 < this.exp) {
            levelUp();
            this.exp -= 100;
        }
    }

    public void levelUp () {
        level++;
        maxHp += 10;
        maxMp += 5;
        att += 2;
        def += 2;
        hp = maxHp;
        mp = maxMp;
        System.out.println("LEVEL UP");
    }
}
