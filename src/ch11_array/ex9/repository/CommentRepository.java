package ch11_array.ex9.repository;

import ch11_array.ex9.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<CommentDTO> commentDTOList = new ArrayList<>();

    public List<CommentDTO> comment() {
        return commentDTOList;
    }

    public boolean commentSave(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }

    public boolean boardcheck(Long findId) {
        boolean result = false;
        for (int i = 0; i < commentDTOList.size(); i++) {
            if (findId.equals(commentDTOList.get(i).getBoardId())) {
                result = true;
            }
        }
        return result;
    }
}
