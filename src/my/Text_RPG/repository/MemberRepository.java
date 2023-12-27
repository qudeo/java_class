package my.Text_RPG.repository;

import my.Text_RPG.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean checkEmail(String email) {
        boolean checkEmail = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail())) {
                checkEmail = true;
            }
        }
        return checkEmail;
    }

    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String email, String pass) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail()) && pass.equals(memberDTOList.get(i).getMemberPassWord())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    public boolean update(String loginEmail, String pass) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberPassWord(pass);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(String pass) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (pass.equals(memberDTOList.get(i).getMemberPassWord())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
}
