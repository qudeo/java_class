package ch11_array.ex9.repository;

import ch10_class.ex7.Calculator;
import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.dto.BoardDTO;

import javax.swing.plaf.basic.BasicViewportUI;
import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean write(String title, String text) {
        BoardDTO boardDTO = new BoardDTO(title, CommonVariables.loginEmail, text);
        boardDTOList.add(boardDTO);
        return true;
    }

    public List<BoardDTO> list() {
        return boardDTOList;
    }

    public BoardDTO findList(Long findId) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (findId.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).plusHits();
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    public boolean write1(Long findById) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (CommonVariables.loginEmail.equals(boardDTOList.get(i).getBoardWriter())) {
                result = true;
            }
        }
        return result;
    }

    public boolean update(String title, String text) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            boardDTOList.get(i).setBoardTitle(title);
            boardDTOList.get(i).setBoardContents(text);
            result = true;
        }
        return result;
    }

    public boolean delete(Long findById) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (findById.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BoardDTO> search(String title) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(title)) {
              boardDTOS.add(boardDTOList.get(i));
            }
        }
        return boardDTOS;
    }
}

