package my.ex2;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO) {
        boolean result = memberDTOList.add(memberDTO);
        return result;
    }
}
