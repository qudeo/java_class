package my.Text_RPG.service;

import my.Text_RPG.dto.CharacterDTO;
import my.Text_RPG.dto.Monster;
import my.Text_RPG.dto.Monster1DTO;
import my.Text_RPG.repository.BattleRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleService {
    List<Monster1DTO> monster1DTOList = new ArrayList<>();
    List<CharacterDTO> characterDTOList = new ArrayList<>();
    CharacterDTO characterDTO = new CharacterDTO();
    Monster1DTO monster1DTO = new Monster1DTO();
    BattleRepository battleRepository = new BattleRepository();
    Scanner scanner = new Scanner(System.in);
    boolean run1 = true;
    boolean run2 = true;
    boolean run3 = true;


    int Select = 0;

    public void Battle() {
        System.out.println("생존한 일 수를 선택하세요.");
        Select = scanner.nextInt();
        if (Select == 1) {
            Monster monster = new Monster();
            System.out.println("생존 1일차..");
            try {
                System.out.println("코딩의 숲에 들어갑니다.");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("앗! 야생의 " + monster1DTO.getName() + "(이)가 나타났다!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (run1) {
                System.out.println("== 무엇을 할까? ==");
                System.out.println("1.싸운다 2.도망친다");
                System.out.println("================");
                Select = scanner.nextInt();
                if (Select == 1) {
                    if (monster1DTO.getHp() >= 0) {
                        while (run2) {
                            battleRepository.monsterAtt();
                            System.out.println(characterDTO.name + "의 차례입니다.");
                            System.out.println("======== 싸운다 ========");
                            System.out.println("1.공격 2.아이템 3.도망친다");
                            System.out.println("====== 캐릭터 상태 =======");
                            System.out.println("체력 : " + characterDTO.getHp());
                            System.out.println("마나 : " + characterDTO.getMp());
                            System.out.println("====== 몬스터 상태 ======");
                            System.out.println("체력 : " + monster1DTO.getHp());
                            System.out.println("=======================");
                            Select = scanner.nextInt();
                            if (Select == 1) {
                                while (run3) {
                                    System.out.println("======== 무엇을 할까? ========");
                                    System.out.println("1.공격 2.돌아가기");
                                    System.out.println("============================");
                                    Select = scanner.nextInt();
                                    if (Select == 1) {
//                                        monster1DTO.attacked();
                                    } else if (Select == 2) {
                                        run3 = false;
                                    } else {
                                        System.out.println("선택지가 없습니다.");
                                    }
                                }
                            } else if (Select == 2) {
                                System.out.println("가방이 없다.");
                            } else if (Select == 3) {
                                System.out.println("돈이 인질 잡혀 도망치지 못했다.");
                            } else {
                                System.out.println("선택지가 없습니다.");
                            }
                        }
                    } else if (characterDTO.getHp() <= 0) {
                        System.out.println(characterDTO.name + "(이)가 사망했습니다.");
                        characterDTO.hp = 1;
                        System.out.println(characterDTO.name + "(이)가 체력" + characterDTO.hp + "으로 부활했습니다.");
                        break;
                    } else {
                        System.out.println(monster1DTO.getName() + "(이)가 도망쳤다!");
                    }
                } else if (Select == 2) {
                    System.out.println("돈이 인질 잡혀 도망치지 못했다.");
                } else {
                    System.out.println("선택지가 없습니다.");
                }
            }
        }
    }
}