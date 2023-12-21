package my.ex2;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO) {
        boolean result = memberDTOList.add(memberDTO);
        return result;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                result = false;
            }
        }
        return result;
    }

    public boolean nameCheck(String memberName) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberName.equals(memberDTOList.get(i).getMemberName())) {
                result = true;
            }
        }
        return result;
    }
}
