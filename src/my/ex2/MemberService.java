package my.ex2;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    private static String loginEmail = null;
    MemberRepository memberRepository = new MemberRepository();
    String memberEmail = null;
    public void save() {
        System.out.println("등록할 이메일을 입력하세요.");
        memberEmail = scanner.next();
        System.out.println("등록할 비밀번호를 입력하세요");
        String memberPasswrod = scanner.next();
        System.out.println("등록할 닉네임을 입력하세요");
        String memberName = scanner.next();
        System.out.println("등록할 전화번호를 입력하세요");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPasswrod, memberName, memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원 등록을 등록했습니다.");
        } else {
            System.out.println("회원 등록을 실패했습니다.");
        }

    }
}
