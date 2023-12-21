package ch11_array.ex9;


import ch11_array.ex9.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        int SelectNo = 0;
        boolean run = true;
        while (run) {
            System.out.println("======================================================================================");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("======================================================================================");
            System.out.print("선택 > ");
            SelectNo = scanner.nextInt();

            if (SelectNo == 1) {
                memberService.save();
            } else if (SelectNo == 2) {
                memberService.login();
            } else if (SelectNo == 3) {
                memberService.list();
            } else if (SelectNo == 4) {
                memberService.update();
            } else if (SelectNo == 5) {
                memberService.secession();
            } else if (SelectNo == 6) {

            } else if (SelectNo == 7) {
                while (run) {
                    System.out.println("==============================================================================");
                    System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
                    System.out.println("==============================================================================");
                    System.out.print("선택 > ");
                    SelectNo = scanner.nextInt();
                    if (SelectNo == 1) {

                    } else if (SelectNo == 2) {

                    } else if (SelectNo == 3) {

                    } else if (SelectNo == 4) {

                    } else if (SelectNo == 5) {

                    } else if (SelectNo == 6) {

                    } else if (SelectNo == 99) {

                    } else if (SelectNo == 0) {

                    } else {
                        System.out.println("메뉴에서 벗어난 입력값입니다.");
                    }
                }
            } else if (SelectNo == 0) {
                run = false;
            } else {
                System.out.println("메뉴에서 벗어난 입력값입니다.");
            }
        }
    }
}