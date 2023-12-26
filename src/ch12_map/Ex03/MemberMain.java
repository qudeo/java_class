package ch12_map.Ex03;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        MemberService memberService = new MemberService();

        while (run) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록조회 | 4.회원정보수정 | 5.회원탈퇴 | 6.로그아웃 | 7.종료");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("선택 > ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.signUp();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.check();
            } else if (selectNo == 4) {
                memberService.correct();
            } else if (selectNo == 5) {
                memberService.secession();
            } else if (selectNo == 6) {
                memberService.logOut();
            } else if (selectNo == 7) {
                run = false;
            } else {
                System.out.println("메뉴에 없는 값입니다.");
            }
        }
    }
}
