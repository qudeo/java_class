package ch11_array.ex9;


import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.repository.BoardRepository;
import ch11_array.ex9.service.BoardService;
import ch11_array.ex9.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        // 멤버서비스 타입의 멤버서비스 객체를 선언한다 = 새로히 멤버서비스클래스를 호출한다.
        BoardService boardService = new BoardService();
        // 보드서비스 타입의 보드서비스 객체를 선언한다 = 새로히 보드서비스클래스를 호출한다.
        Scanner scanner = new Scanner(System.in);
        // 스캐너타입의 스캐너객체를 선언한다 = 새로히 스캐너를 등록한다 (스캐너에 등록한 값을 초기화 해준다).
        int SelectNo = 0;
        // 인트타입의 셀렉트놈 변수를 선언한다 = 0으로 선언한다.
        boolean run1 = true;
        // 블린타입의 런1 변수를 선언한다 = 트루라고 선언한다.
        while (run1) {
            // 와일문을 실행한다 (조건이 런1인 동안)
            System.out.println("======================================================================================");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("======================================================================================");
            System.out.print("선택 > ");
            SelectNo = scanner.nextInt();
            //셀렉트놈의 값은 인트타입의 스캐너로 입력한 값이다.
            if (SelectNo == 1) {
                //만약에 셀렉트놈의 값이 1과 같다면
                memberService.save();
                //멤버서비스 객체의 세이브 메소드를 호출한다.
            } else if (SelectNo == 2) {
                //위의 조건이 아니고 셀렉트놈의 값이 2와 같다면
                memberService.login();
                //멤버서비스 객체의 로그인 메소드를 호출한다.
            } else if (SelectNo == 3) {
                //위의 조건이 아니고 셀렉트놈의 값이 3과 같다면
                memberService.list();
                //멤버서비스 객체의 리스트 메소드를 호출한다.
            } else if (SelectNo == 4) {
                //위의 조건이 아니고 셀렉트놈의 값이 4와 같다면
                memberService.update();
                //멤버서비스 객체의 업데이트 메소드를 호출한다.
            } else if (SelectNo == 5) {
                //위의 조건이 아니고 셀렉트놈의 값이 5와 같다면
                memberService.delete();
                //멤버서비스 객체의 딜리트 메소드를 호출한다.
            } else if (SelectNo == 6) {
                //위의 조건이 아니고 셀렉트놈의 값이 6과 같다면
                memberService.logout();
                //멤버서비스 객체의 로그아웃 메소드를 호출한다.
            } else if (SelectNo == 7) {
                //위의 조건이 아니고 셀렉트놈의 값이 7과 같다면
                boolean run2 = true;
                //블린타입의 런2는 트루와 같다
                if (CommonVariables.loginEmail != null) {
                    //만약에 커먼베리어블스 클래스에 있는 로그인이메일 변수가 널이 아니라면
                    while (run2) {
                        //와일문을 실행한다 (조건이 런2인 동안)
                        System.out.println("==============================================================================");
                        System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
                        System.out.println("==============================================================================");
                        System.out.print("선택 > ");
                        SelectNo = scanner.nextInt();
                        //셀렉트놈의 값이 인트타입의 스캐너의 값이랑 같다
                        if (SelectNo == 1) {
                            //만약에 셀렉트놈의 값이 1과 같다면
                            boardService.write();
                            //보드서비스 객체의 라이트 메소드를 호출한다
                        } else if (SelectNo == 2) {
                            //위의 조건이 아니고 셀렉트놈의 값이 2와 같다면
                            boardService.list();
                            //보드서비스 객체의 리스트 메소드를 호출한다
                        } else if (SelectNo == 3) {
                            //위의 조건이 아니고 셀렉트놈의 값이 3과 같다면
                            boardService.findList();
                            //보드서비스 객체의 파인드리스트 메소드를 호출한다
                        } else if (SelectNo == 4) {
                            //위의 조건이 아니고 셀렉트놈의 값이 4와 같다면
                            boardService.update();
                            //보드서비스 객체의 업데이트 메소드를 호출한다
                        } else if (SelectNo == 5) {
                            //위의 조건이 아니고 셀렉트놈의 값이 5와 같다면
                            boardService.delete();
                            //보드서비스 객체의 딜리트 메소드를 호출한다
                        } else if (SelectNo == 6) {
                            //위의 조건이 아니고 셀렉트 놈의 값이 6과 같다면
                            boardService.search();
                            //보드서비스 객체의 서치 메소드를 호출한다
                        } else if (SelectNo == 99) {
                            //위의 조건이 아니고 셀렉트놈의 값이 99와 같다면
                        } else if (SelectNo == 0) {
                            //위의 조건이 아니고 셀렉트놈의 값이 0과 같다면
                            run2 = false;
                            //런2 변수는 펄스와 같다
                        } else {
                            //위의 조건이 아니라면
                            System.out.println("메뉴에서 벗어난 입력값입니다.");
                        }
                    }
                } else {
                    //위의 조건이 아니라면
                    System.out.println("로그인해주세요.");
                }
            } else if (SelectNo == 0) {
                //위의 조건이 아니고 셀렉트놈의 값이 0과 같다면
                run1 = false;
                //런1 변수는 펄스와 같다
            } else {
                //위의 조건이 아니라면
                System.out.println("메뉴에서 벗어난 입력값입니다.");
                //
            }
        }
    }
}