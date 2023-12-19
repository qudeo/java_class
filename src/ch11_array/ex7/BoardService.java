package ch11_array.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.print("제목을 작성하세요 > ");
        String boardTitle = scanner.next();
        System.out.print("작성자를 등록하세요 > ");
        String boardWriter = scanner.next();
        System.out.print("내용을 작성하세요 > ");
        String boardContents = scanner.next();
        System.out.print("비밀번호를 입력하세요 > ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("등록을 성공했습니다.");
        } else {
            System.out.println("등록을 실패했습니다.");
        }
    }

    public void list() {
        List<BoardDTO> boardDTOList = boardRepository.list();
        System.out.println(boardDTOList);
    }

    public void findByList() {
        System.out.print("조회할 Id를 입력하세요 > ");
        Long findById = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findByList(findById);
        if (boardDTO != null) {
            System.out.println(boardDTO);
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }

    public void updata() {
        System.out.print("수정할 글의 Id를 입력하세요 > ");
        Long Id = scanner.nextLong();
        System.out.print("수정할 글의 Pw를 입력하세요 > ");
        String Pw = scanner.next();
        BoardDTO boardDTO = boardRepository.check(Id, Pw);
        if (boardDTO != null) {
            if (Pw.equals(boardDTO.getBoardPass())) {
                System.out.print("수정한 글의 제목을 입력하세요 > ");
                String Title = scanner.next();
                System.out.print("수정한 글의 내용을 입력하세요 > ");
                String Contents = scanner.next();
                boolean result = boardRepository.update(Title, Contents);
                if (result) {
                    System.out.println("수정을 성공했습니다.");
                } else {
                    System.out.println("수정을 실패했습니다");
                }
            } else {
                System.out.println("입력하신 비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("요청하신 게시글은 존재하지 않습니다.");
            }
        }


    public void delete() {
        System.out.print("수정할 글의 Id를 입력하세요 > ");
        Long Id = scanner.nextLong();
        System.out.print("수정할 글의 Pw를 입력하세요 > ");
        String Pw = scanner.next();
        boolean result = boardRepository.delete(Id, Pw);
        if (result) {
            System.out.println("삭제를 성공했습니다.");
        } else {
            System.out.println("입력하신 비밀번호가 틀렸습니다.");
        }
    }

    public void search() {
        System.out.print("찾으시는 글의 제목을 입력하세요 > ");
        String Title = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(Title);
        if (boardDTOList.size() > 0) {
            System.out.println("검색 결과 ");
            for (int i = 0; i < boardDTOList.size(); i++) {
                System.out.println(boardDTOList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
