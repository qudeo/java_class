package ch11_array.ex7;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean save(BoardDTO boardDTO) {
        boolean result = boardDTOList.add(boardDTO);
        return result;
    }

    public List<BoardDTO> list() {
        return boardDTOList;
    }

    public BoardDTO findByList(Long findById) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (findById.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).plusHits();

                 boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    public BoardDTO check(Long Id, String Pw) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (Pw.equals(boardDTOList.get(i).getBoardPass()) && Id.equals(boardDTOList.get(i).getId())) {
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    public boolean update(String title, String contents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            boardDTOList.get(i).setBoardTitle(title);
            boardDTOList.get(i).setBoardContents(contents);
            result = true;
        }
        return result;
    }

    public boolean delete(Long Id, String Pw) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (Id.equals(boardDTOList.get(i).getId()) && Pw.equals(boardDTOList.get(i).getBoardPass())) {
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
