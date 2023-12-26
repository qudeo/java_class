package ch12_map.Ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean signUp (MemberDTO memberDTO) {
        MemberDTO dto = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if (dto == null) {
            return true;
        }
        return false;
    }

    public MemberDTO login(String memberEail, String memberPassword) {
        for (Long i: memberDTOMap.keySet()) {
            if (memberEail.equals(memberDTOMap.get(i).getMemberEmail()) && memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                return memberDTOMap.get(i);
            }
        }
        return null;
    }

    public Map<Long, MemberDTO>check() {
        return memberDTOMap;
    }

    public boolean correct(String loginEmail, int memberMobile) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail()));
            System.out.print("전화번호 > ");
            memberDTOMap.get(i).setMemberMobile(memberMobile);
            result = true;
        }
        return result;
    }

    public boolean secession(String memberEmail) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()){
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.remove(i);
                result = true;
            }
        }
        return result;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다 => 결과를 false로 주자
                result = false;
            }
        }
        return result;
    }
}
