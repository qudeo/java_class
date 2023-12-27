package ch11_array.ex9.service;

import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.dto.MemberDTO;
import ch11_array.ex9.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();
    //멤버레포타입의 멤버레포객체는 새로운 멤버레포클래스에서 선언한거와 같다
    Scanner scanner = new Scanner(System.in);
    //스캐너타입의 스캐너객체는 새로운 스캐너를 선언한것과 같다
    String memberEmail = null;
    //스트링타입의 멤버이메일은 널과 같다
    public void save() {
        //리턴없고 매개체 없는 세이브 메소드
        boolean run = true;
        //블린타입의 런변수는 트루와 같다
        String email = null;
        //스트링타입의 이메일변수는 널과 같다
        System.out.println("회원가입 메뉴");
        while (run) {
            //와일문은 런변수를 사용하여 시작한다
            System.out.print("이메일 : ");
            email = scanner.next();
            boolean checkEmail = memberRepository.checkEmail(email);
            //블린타입의 체크이메일변수는 멤버레포의 체크이메일메소드에 이메일변수를 넣어 얻은 결과와 같다
            if (!checkEmail) {
                //만약에 체크이메일변수가 아닐때
                System.out.println("사용 가능한 이메일 입니다.");
                run = false;
                //런변수는 펄스가 된다
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
        //멤버타입의 멤버변수는 새로운 멤버메소드에 이메일, 패스, 네임, 모바일변수를 넣어 얻은 결과와 같다
        boolean result = memberRepository.save(memberDTO);
        //블린타입의 리절트변수는 멤버레포의 세이브메소드에 멤버디티오변수를 넣어 얻은 결과와 같다
        if (result) {
            //만약 리절트라면
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
        // 멤버티디오타입의 멤버디티오변수는 멤버레포의 로그인메소드에 이메일, 패스변수를 넣어 얻은 결과와 같다
        if (memberDTO != null) {
            //만약에 멤버티디오가 널이 아니라면
            System.out.println("로그인 성공");
            CommonVariables.loginEmail = email;
            //커먼베리어블스.로그인이메일은 이메일변수와 같다
            System.out.println(CommonVariables.loginEmail + "님 환영합니다!");
        } else {
            System.out.println("이메일 또는 비밀번호가 틀립니다!");
        }
    }

    public void list() {
        //리턴없고 매개체없는 리스트메소드
        List<MemberDTO> memberDTOList = memberRepository.list();
        //멤버디티오이름을 가진 리스트의 멤버디티오리스트변수는 멤버레포의 리스트메소드와 같다
        System.out.println(memberDTOList);
    }

    public void update() {
        //리턴없고 매개체없는 업데이트메소드
        if (CommonVariables.loginEmail != null) {
            //만약에 커먼베리어블스이메일이 널이 아닐때
            System.out.print("변경할 전화번호 : ");
            String mobile = scanner.next();
            boolean memberDTO = memberRepository.updata(CommonVariables.loginEmail, mobile);
            //블린타입의 멤버디티오변수는 멤버레포의 업데이트메소드에 커먼베리어블스.로그인이메일, 모바일 변수를 넣어 얻은 결과와 같다
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
        //리턴없고 매개체없는 딜리스메소드
        if (CommonVariables.loginEmail != null) {
            //만약에 커먼베리어블스.로그인이메일이 널이 아니라면
            System.out.print("비밀번호");
            String pass = scanner.next();
            MemberDTO memberDTO = memberRepository.login(CommonVariables.loginEmail, pass);
            //멤버디티오타입의 멤버디티오객체는 멤버레포의 로그인메소드에 커먼베리어블스.로그인이메일, 패스를 넣어 얻은 결과와 같다
            if (memberDTO != null) {
                boolean result = memberRepository.delete(CommonVariables.loginEmail);
                //블린타입의 리절트변수는 멤버레포의 딜리트메소드에 커먼베리어블스.로그인이메일변수를 넣어 얻은 결과와 같다
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
        //리턴없고 매개체없는 로그아웃메소드
        if (CommonVariables.loginEmail != null) {
            //만약에 커먼베리어블스.로그인이메일이 널이 아닐때
            CommonVariables.loginEmail = null;
            //로그인베리어블스.로그인이메일은 널과 같다
            System.out.println("로그아웃되었습니다.");
        }
    }
}
