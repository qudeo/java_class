package my.ex2;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        boolean run = true;

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("1.회원가입 | 2.로그인 | 3.회원 조회 | 4.회원 정보수정 | 5.회원 탈퇴 | 6.로그아웃 | 7.시스템 종료");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("메뉴를 선택하세요 > ");
        int SelectNo = scanner.nextInt();
        while (run) {
            if (SelectNo == 1) {
                memberService.save();
            } else if (SelectNo == 2) {

            } else if (SelectNo == 3) {

            } else if (SelectNo == 4) {

            } else if (SelectNo == 5) {

            } else if (SelectNo == 6) {

            } else if (SelectNo == 7) {
                run = false;
            } else {
                System.out.println("메뉴에 등록되지않은 값입니다.");
            }
        }
    }
}
