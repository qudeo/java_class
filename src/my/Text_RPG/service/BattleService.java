package my.Text_RPG.service;

import my.Text_RPG.dto.*;
import my.Text_RPG.repository.BattleRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleService {
    static List<Monster1DTO> monster1DTOList = new ArrayList<>();
    static List<Monster2DTO> monster2DTOList = new ArrayList<>();
    static List<Monster25DTO> monster3DTOList = new ArrayList<>();
    static List<CharacterDTO> characterDTOList = new ArrayList<>();
    static List<Character2DTO> character2DTOList = new ArrayList<>();
    CharacterDTO characterDTO = new CharacterDTO();
    Character2DTO character2DTO = new Character2DTO();
    Monster1DTO monster1DTO = new Monster1DTO();
    Monster2DTO monster2DTO = new Monster2DTO();
    Monster25DTO monster25DTO = new Monster25DTO();
    BattleRepository battleRepository = new BattleRepository();
    Scanner scanner = new Scanner(System.in);
    boolean run1 = true;
    boolean run2 = true;


    int Select = 0;

    public void Battle() {
        System.out.println("=====  생존한 일 수를 선택하세요  =====");
        System.out.println(" 1.1일차 | 2.2일차 | 3.3일차 | 4.4일차");
        System.out.println("===================================");
        System.out.print("선택 : ");
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
                System.out.println("부스럭..");
                Thread.sleep(1000);
                System.out.println("부스럭..");
                Thread.sleep(1000);
                System.out.println("앗! 야생의 " + monster1DTO.getName() + "(이)가 나타났다!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (run1) {
                System.out.println("== 무엇을 할까? ====");
                System.out.println("1.싸운다 | 2.도망친다");
                System.out.println("==================");
                Select = scanner.nextInt();
                if (Select == 1) {
                    while (run2) {
                        System.out.println(characterDTO.name + "님의 차례입니다.");
                        System.out.println("======== 싸운다 ============");
                        System.out.println("1.공격 | 2.아이템 | 3.도망친다");
                        System.out.println("===========================");
                        Select = scanner.nextInt();
                        if (Select == 1) {
                            boolean run3 = true;
                            while (run3) {
                                System.out.println("=== 무엇을 할까? ===");
                                System.out.println(" 1.공격 | 2.돌아가기");
                                System.out.println("==================");
                                Select = scanner.nextInt();
                                int monsterDTOhp = 0;
                                if (Select == 1) {
                                    monsterDTOhp = battleRepository.CharAtt();
                                    try {
                                        Thread.sleep(1000);
                                        System.out.println(characterDTO.name + "의 노동의 호미질!");
                                        Thread.sleep(1000);
                                        System.out.println("쒸이익~");
                                        Thread.sleep(2000);
                                        System.out.println("촉!");
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println(monster1DTO.name + "(이)가 " + characterDTO.name + "의 노동의 일격 '" + characterDTO.att + "' 데미지를 맞고 " +
                                            "체력이 " + monsterDTOhp + "가 되었습니다.");
                                    if (monsterDTOhp <= 0) {
                                        System.out.println(monster1DTO.getName() + "(이)가 도망쳤다!");
                                        System.out.println("축하합니다! 튜토리얼을 클리어 하셨습니다.");
                                        System.out.println("클리어 보상 : 없습니다.");
                                        return;
                                    }
                                    int characterDTOhp = battleRepository.monsterAtt();
                                    try {
                                        Thread.sleep(1000);
                                        System.out.println(monster1DTO.name + "의 노동 착취!");
                                        Thread.sleep(1000);
                                        System.out.println("차라락");
                                        Thread.sleep(2000);
                                        System.out.println("쇽!");
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println(characterDTO.name + "(이)가 " + monster1DTO.name + "의 노동 착취 '" + monster1DTO.att + "' 데미지를 당하여 기운이 빠져나가" +
                                            "체력이 " + characterDTOhp + "가 되었습니다.");
                                    System.out.println("== 캐릭터 상태 ==");
                                    System.out.println("체력 : " + characterDTOhp);
                                    System.out.println("마나 : " + characterDTO.getMp());
                                    System.out.println("== 악덕사장 상태 ==");
                                    System.out.println("체력 : " + monsterDTOhp);
                                    System.out.println("================");
                                    if (characterDTOhp <= 0) {
                                        System.out.println(characterDTO.name + "(이)가 사망했습니다.");
                                        characterDTO.hp = 1;
                                        System.out.println(characterDTO.name + "(이)가 체력" + characterDTO.hp + "으로 부활했습니다.");
                                        return;
                                    }
                                } else if (Select == 2) {
                                    run3 = false;
                                } else {
                                    break;
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
                } else if (Select == 2) {
                    System.out.println("돈이 인질 잡혀 도망치지 못했다.");
                } else {
                    System.out.println("선택지가 없습니다.");
                }
            }
        }
        if (Select == 2) {
            Monster monster = new Monster();
            System.out.println("생존 2일차..");
            try {
                System.out.println("코딩의 숲에 들어갑니다.");
                Thread.sleep(1000);
                System.out.println(".");
                Thread.sleep(1000);
                System.out.println("..");
                Thread.sleep(1000);
                System.out.println("...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("숲 속 깊은 곳, 코딩 동굴에 도착했습니다.");
                Thread.sleep(2000);
                System.out.println(characterDTO.name + "(은)는 코딩 동굴을 들어갑니다.");
                Thread.sleep(1000);
                System.out.println("또륵..");
                Thread.sleep(1000);
                System.out.println("쿵..");
                Thread.sleep(1000);
                System.out.println("쿵..");
                System.out.println("무언가 큰 생물이 걸어오고 있다.");
                Thread.sleep(2000);
                System.out.println("..! 동굴의 " + monster2DTO.name + "(를)을 마주쳤다!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (run1) {
                System.out.println("== 무엇을 할까? ====");
                System.out.println("1.싸운다 | 2.도망친다");
                System.out.println("==================");
                Select = scanner.nextInt();
                if (Select == 1) {
                    while (run2) {
                        System.out.println(character2DTO.name + "님의 차례입니다.");
                        System.out.println("======== 싸운다 ============");
                        System.out.println("1.공격 | 2.아이템 | 3.도망친다");
                        System.out.println("===========================");
                        Select = scanner.nextInt();
                        if (Select == 1) {
                            boolean run3 = true;
                            while (run3) {
                                System.out.println("=== 무엇을 할까? ===");
                                System.out.println(" 1.공격 | 2.돌아가기");
                                System.out.println("==================");
                                Select = scanner.nextInt();
                                int monsterDTOhp = 0;
                                if (Select == 1) {
                                    monsterDTOhp = battleRepository.CharAtt2();
                                    try {
                                        Thread.sleep(1000);
                                        System.out.println(characterDTO.name + "의 노동의 칼부림!");
                                        Thread.sleep(1000);
                                        System.out.println("스릉~");
                                        Thread.sleep(2000);
                                        System.out.println("촵!");
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("효과가 별로 없는듯 하다..");
                                    System.out.println(monster2DTO.name + "(이)가 " + character2DTO.name + "의 노동의 칼부림 '" + character2DTO.att + "' 데미지를 맞고 " +
                                            "체력이 " + monsterDTOhp + "가 되었습니다.");

                                    if (monsterDTOhp <= 0) {
                                        System.out.println(monster2DTO.getName() + "(이)가 도망쳤다!");
                                        System.out.println("축하합니다! 튜토리얼을 클리어 하셨습니다.");
                                        System.out.println("클리어 보상 : 없습니다.");
                                        return;
                                    }
                                    int characterDTOhp = battleRepository.monsterAtt2();
                                    try {
                                        Thread.sleep(2000);
                                        System.out.println(monster2DTO.name + "의 할퀴기!");
                                        Thread.sleep(300);
                                        System.out.println("부");
                                        Thread.sleep(300);
                                        System.out.println("오");
                                        Thread.sleep(300);
                                        System.out.println("오");
                                        Thread.sleep(300);
                                        System.out.println("옹!");
                                        Thread.sleep(1000);
                                        if (characterDTOhp <= 0) {
                                            System.out.println(character2DTO.name + "(이)가 극적으로 회피하며 넘어졌다.");
                                            characterDTOhp = 1;
                                            try {
                                                Thread.sleep(1500);
                                                System.out.println(character2DTO.name + "(은)는 급하게 주변에 널부러진 마늘과 쑥을 던졌다.");
                                                Thread.sleep(1500);
                                                System.out.println("마늘과 쑥이 " + monster2DTO.name + "입 안으로 던져졌다.");
                                                Thread.sleep(1500);
                                                System.out.println("오잉..! " + monster2DTO.name + "의 상태가..!");
                                                Thread.sleep(500);
                                                System.out.println("!");
                                                Thread.sleep(500);
                                                System.out.println("!!");
                                                Thread.sleep(500);
                                                System.out.println("!!!");
                                                Thread.sleep(500);
                                                System.out.println(monster2DTO.name + "(이)가 " + monster25DTO.name + "로 진화했다!");
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                            System.out.println("== 캐릭터 상태 ==");
                                            System.out.println("체력 : " + characterDTOhp);
                                            System.out.println("마나 : " + characterDTO.getMp());
                                            System.out.println("== 웅녀 상태 ==");
                                            System.out.println("체력 : " + monsterDTOhp);
                                            System.out.println("공격 : " + monster25DTO.att);
                                            System.out.println("================");
                                            boolean run4 = true;
                                            while (run4) {
                                                System.out.println("=== 무엇을 할까? ===");
                                                System.out.println(" 1.공격 | 2.돌아가기");
                                                System.out.println("==================");
                                                Select = scanner.nextInt();
                                                if (Select == 1) {
                                                    try {
                                                        Thread.sleep(1000);
                                                        System.out.println("웅녀 : 감사합니다. 덕분에 사람이 되었습니다.");
                                                        System.out.println("답례로 마을로 다시 돌려 보내 드리겠습니다.");
                                                        Thread.sleep(2000);
                                                        System.out.println("마을로 돌아갑니다.");
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    return;
                                                } else if (Select == 2) {
                                                    try {
                                                        Thread.sleep(1000);
                                                        System.out.println("웅녀 : 감사합니다. 덕분에 사람이 되었습니다.");
                                                        System.out.println("답례로 마을로 다시 돌려 보내 드리겠습니다.");
                                                        Thread.sleep(2000);
                                                        System.out.println("마을로 돌아갑니다.");
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                        System.out.println("빡!");
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("효과가 굉장했다!");
                                    System.out.println(character2DTO.name + "(이)가 " + monster2DTO.name + "의 할퀴기 '" + monster2DTO.att + "' 데미지를 당하여 머리가 찌그러져 " +
                                            "체력이 " + characterDTOhp + "가 되었습니다.");
                                    System.out.println("== 캐릭터 상태 ==");
                                    System.out.println("체력 : " + characterDTOhp);
                                    System.out.println("마나 : " + characterDTO.getMp());
                                    System.out.println("== 반달가슴곰 상태 ==");
                                    System.out.println("체력 : " + monsterDTOhp);
                                    System.out.println("================");

                                } else if (Select == 2) {
                                    run3 = false;
                                } else {
                                    break;
                                }
                            }
                        } else if (Select == 2) {
                            System.out.println("가방이 없다.");
                        } else if (Select == 3) {
                            System.out.println("겁에 질려 도망치지 못했다.");
                        } else {
                            System.out.println("선택지가 없습니다.");
                        }
                    }
                } else if (Select == 2) {
                    System.out.println("겁에 질려 도망치지 못했다.");
                } else {
                    System.out.println("선택지가 없습니다.");
                }
            }
        }
    }
}