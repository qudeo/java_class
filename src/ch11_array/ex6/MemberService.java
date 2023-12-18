package ch11_array.ex6;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    private static String loginEmail = null;
    MemberRepository memberRepository = new MemberRepository();
    String memberEail = null;

    public void signUp() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        String memberEmail = null;
        do {
            System.out.print("이메일");
            memberEmail = scanner.next();
            // checkResult가 true => 사용가능(반복문 종료), checkResult가 false => 사용불가(다시 이메일입력)
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        } while (!checkResult); // checkResult 값이 false라면 계속 반복되도록

        System.out.print("비밀번호");
        String memberPassword = scanner.next();
        System.out.print("닉네임");
        String memberName = scanner.next();
        System.out.print("전화번호");
        int memberMobile = scanner.nextInt();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.signUp(memberDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void login() {
        System.out.print("이메일");
        memberEail = scanner.next();
        System.out.print("비밀번호");
        String memberPassword = scanner.next();
        MemberDTO memberDTO = memberRepository.login(memberEail, memberPassword);
        if (memberDTO != null) {
            System.out.println("로그인 성공");
            loginEmail = memberEail;
            System.out.println(memberDTO);
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void check() {
        List<MemberDTO> memberDTOList = memberRepository.check();
        System.out.println(memberDTOList);
    }

    public void correct() {
        if (loginEmail != null) {
            System.out.println("변경할 전화번호를 입력하세요");
            int memberMobile = scanner.nextInt();
            boolean memberDTO = memberRepository.correct(loginEmail, memberMobile);
            if (memberDTO) {
                System.out.println("변경되었습니다.");
            } else {
                System.out.println("실패했습니다.");
            }
        } else {
            System.out.println("로그인하세요");
        }

    }

    public void secession() {
        if (loginEmail != null) {
            System.out.println("삭제할 회원 이메일");
            System.out.print("비밀번호");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.login(loginEmail, memberPassword);
            if (memberDTO != null) {
                boolean result = memberRepository.secession(loginEmail);
                if (result) {
                    System.out.println("삭제 성공");
                } else {
                    System.out.println("삭제 실패");
                }
            }else{
                System.out.println("로그인하세요");
            }
        }
    }

    public void logOut() {
        loginEmail = null;
        System.out.println("로그아웃 되었습니다.");
    }
}
