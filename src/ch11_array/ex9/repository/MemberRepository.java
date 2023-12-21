package ch11_array.ex9.repository;

import ch11_array.ex9.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

    List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean checkEmail(String email) {
        boolean checkResult = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail())) {
                checkResult = true;
            }
        }
        return checkResult;
    }

    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String email, String pass) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public List<MemberDTO> list() {
        return memberDTOList;
    }

    public boolean updata(String loginEmail, String mobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(mobile);
                result = true;
            }
        }
        return result;
    }
}
