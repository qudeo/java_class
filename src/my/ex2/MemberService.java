package my.ex2;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    private static String loginEmail = null;
    MemberRepository memberRepository = new MemberRepository();


    // 회원가입
    public void save() {
        boolean checkResult;
        boolean checkResult1;
        String memberName;
        String memberEmail;
        // 이메일
        do {
            System.out.print("등록할 이메일을 입력하세요 : ");
            memberEmail = scanner.next();
            checkResult = memberRepository.emailCheck(memberEmail);
            if (!checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        } while (checkResult);
        // 비밀번호
        System.out.print("등록할 비밀번호를 입력하세요 : ");
        String memberPasswrod = scanner.next();
        // 닉네임
        do {
            System.out.print("등록할 닉네임을 입력하세요 : ");
            memberName = scanner.next();
            checkResult1 = memberRepository.nameCheck(memberName);
            if (!checkResult1) {
                System.out.println("사용 가능한 닉네임 입니다.");
            } else {
                System.out.println("이미 사용 중인 닉네임 입니다. 다른 닉네임을 입력해주세요.");
            }
        } while (checkResult1);
        // 전화번호
        System.out.print("등록할 전화번호를 입력하세요 : ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPasswrod, memberName, memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원을 등록했습니다.");
        } else {
            System.out.println("회원 등록을 실패했습니다.");
        }
    }
}
