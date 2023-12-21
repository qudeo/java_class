package ch11_array.ex9.service;

import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.dto.MemberDTO;
import ch11_array.ex9.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);
    String memberEmail = null;
    public void save() {
        boolean run = true;
        String email = null;
        System.out.println("회원가입 메뉴");
        while (run) {
            System.out.print("이메일 : ");
            email = scanner.next();
            boolean checkEmail = memberRepository.checkEmail(email);
            if (!checkEmail) {
                System.out.println("사용 가능한 이메일 입니다.");
                run = false;
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        }
        System.out.print("비밀번호 : ");
        String pass = scanner.next();
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("전화번호 : ");
        String mobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(email, pass, name, mobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원가입을 성공했습니다.");
        } else {
            System.out.println("회원가입을 실패했습니다.");
        }

    }

    public void login() {
        System.out.println("로그인 메뉴");
        System.out.print("이메일 : ");
        String email = scanner.next();
        System.out.print("비밀번호 : ");
        String pass = scanner.next();
        MemberDTO memberDTO = memberRepository.login(email, pass);
        if (memberDTO != null) {
            System.out.println("로그인 성공");
            CommonVariables.loginEmail = email;
            System.out.println(CommonVariables.loginEmail + "님 환영합니다!");
        } else {
            System.out.println("이메일 또는 비밀번호가 틀립니다!");
        }
    }

    public void list() {
        List<MemberDTO> memberDTOList = memberRepository.list();
        System.out.println(memberDTOList);
    }

    public void update() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("변경할 전화번호 : ");
            String mobile = scanner.next();
            boolean memberDTO = memberRepository.updata(CommonVariables.loginEmail, mobile);
            if (memberDTO) {
                System.out.println("변경되었습니다.");
            } else {
                System.out.println("변경을 실패했습니다.");
            }
        } else {
            System.out.println("로그인하세요.");
        }
    }

    public void delete() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("비밀번호");
            String pass = scanner.next();
            MemberDTO memberDTO = memberRepository.login(CommonVariables.loginEmail, pass);
            if (memberDTO != null) {
                boolean result = memberRepository.delete(CommonVariables.loginEmail);
                if (result) {
                    System.out.println("회원탈퇴가 정상적으로 처리되었습니다. 감사합니다.");
                } else {
                    System.out.println("탈퇴가 처리되지 않았습니다. 다시 시도해 주시기 바랍니다.");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 메인메뉴로 돌아갑니다.");
            }
        } else {
            System.out.println("로그인하세요.");
        }
    }

    public void logout() {
        if (CommonVariables.loginEmail != null) {
            CommonVariables.loginEmail = null;
        }
    }
}
