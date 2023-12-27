package my.Text_RPG;

import my.Text_RPG.common.CommonVariables;
import my.Text_RPG.service.*;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        ClassService classService = new ClassService();
        GameService gameService = new GameService();
        ShopService shopService = new ShopService();
        CharacterService characterService = new CharacterService();

        Scanner scanner = new Scanner(System.in);
        int Select = 0;
        boolean run1 = true;

        while (run1) {
            System.out.println("======================================================================================");
            System.out.println("1.회원가입 | 2.로그인 | 3.계정조회 | 4.계정수정 | 5.계정삭제 | 6.로그아웃 | 7.게임접속 | 0.종료");
            System.out.println("======================================================================================");
            System.out.print("선택 > ");
            Select = scanner.nextInt();
            if (Select == 1) {
                memberService.save();
            } else if (Select == 2) {
                memberService.login();
            } else if (Select == 3) {
                memberService.findAll();
            } else if (Select == 4) {
                memberService.update();
            } else if (Select == 5) {
                memberService.delete();
            } else if (Select == 6) {
                memberService.logout();
            } else if (Select == 7) {
                boolean run2 = true;
                if (CommonVariables.loginEmail != null) {
                    while (run2) {
                        System.out.println("====================================");
                        System.out.println("1.직업을 선택한다 | 2.메인메뉴");
                        System.out.println("====================================");
                        System.out.print("선택 > ");
                        Select = scanner.nextInt();
                        if (Select == 1) {
                            System.out.println("== 직업목록 ==");
                            System.out.println("");
                            System.out.println("1.외노자");
                            System.out.println("공격력이 강한 직업입니다.");
                            System.out.println("");
                            System.out.println("2.반달가슴곰");
                            System.out.println("현재 마늘과 쑥을 99일동안 섭취하느라 선택할 수 없습니다.");
                            System.out.println("");
                            System.out.println("3.이완용");
                            System.out.println("사망해서 선택할 수 없습니다.");
                            System.out.println("");
                            System.out.println("4.김재희씨");
                            System.out.println("먼 길을 떠나서 선택할 수 없습니다.");
                            System.out.println("");
                            System.out.print("직업을 선택하세요 : ");
                            Select = scanner.nextInt();
                            if (Select == 1) {
                                boolean run3 = true;
                                while (run3) {
                                    System.out.println("================================================================================");
                                    System.out.println("1.전투 | 2.상점 | 3.휴식 | 4.캐릭터정보 | 5.아이템 | 6.직업정보 | 7.전 페이지로 돌아갑니다");
                                    System.out.println("================================================================================");
                                    System.out.print("선택 > ");
                                    Select = scanner.nextInt();
                                    if (Select == 1) {

                                    } else if (Select == 2) {

                                    } else if (Select == 3) {

                                    } else if (Select == 4) {
                                        characterService.status();
                                    } else if (Select == 5) {

                                    } else if (Select == 6) {

                                    } else if (Select == 7) {
                                        run3 = false;
                                    } else {
                                        System.out.println("메뉴에 없는 입력값입니다.");
                                    }
                                }
                            } else if (Select == 2) {
                                System.out.println("다음날에 깨어납니다.");
                            } else if (Select == 3) {
                                System.out.println("선택할 수 없습니다.");
                            } else if (Select == 4) {
                                System.out.println("그녀(이)가 곧 돌아옵니다.");
                            } else {
                                System.out.println("선택하신 직업이 없습니다. 직업 선택창으로 돌아갑니다.");
                            }
                        } else if (Select == 2) {
                            run2 = false;
                        } else {
                            System.out.println("메뉴에 없는 입력값입니다.");
                        }
                    }
                } else if (Select == 0) {
                    run1 = false;
                } else {
                    System.out.println("메뉴에 없는 입력값입니다.");
                }
            }
        }
    }
}




