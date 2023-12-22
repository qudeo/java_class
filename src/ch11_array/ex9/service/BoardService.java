package ch11_array.ex9.service;

import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.dto.BoardDTO;
import ch11_array.ex9.dto.CommentDTO;
import ch11_array.ex9.repository.BoardRepository;
import ch11_array.ex9.repository.CommentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();
    Scanner scanner = new Scanner(System.in);

    public void write() {
        System.out.print("제목 : ");
        String title = scanner.next();
        System.out.print("내용 : ");
        String text = scanner.next();
        boolean result = boardRepository.write(title, text);
        if (result) {
            System.out.println("글작성 완료");
        } else {
            System.out.println("글작성 실패");
        }
    }

    public void list() {
        List<BoardDTO> boardDTOList = boardRepository.list();
        System.out.println(boardDTOList);
    }

    public void findList() {
        System.out.print("조회할 글의 id를 입력하세요 : ");
        Long findId = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findList(findId);
        int Select = 0;
        if (boardDTO != null) {
            System.out.println(boardDTO);
            System.out.println("== 댓글 ==");
            boolean boardcheck = commentRepository.boardcheck(findId);
            List<CommentDTO> commentDTOList = commentRepository.comment();
            if (commentDTOList.size() > 0) {
                if (boardcheck) {
                    System.out.println(commentDTOList);
                } else {
                    System.out.println("작성된 댓글이 없습니다.");
                }
            } else {
                System.out.println("작성된 댓글이 없습니다.");
            }
            System.out.println("댓글을 작성하시려면 1번을 입력하세요.");
            System.out.println("게시판으로 돌아가려면 2번을 입력하세요.");
            Select = scanner.nextInt();
            if (Select == 1) {
                System.out.println("댓글 내용 : ");
                String comment = scanner.next();
                CommentDTO commentDTO = new CommentDTO(findId, CommonVariables.loginEmail, comment);
                boolean commentDTO1 = commentRepository.commentSave(commentDTO);
                if (commentDTO1){
                    System.out.println("댓글 작성 완료");
                }else{
                    System.out.println("댓글 작성 실패");
                }
            } else if (Select == 2) {
                System.out.println("게시판으로 돌아갑니다.");
            } else {
                System.out.println("요청하신 정보를 찾을 수 없습니다.");
            }
        }
    }


    public void update() {
        System.out.println("수정할 게시글의 id 입력하세요 : ");
        Long findById = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findList(findById);
        if (boardDTO != null) {
            if (CommonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
                boolean boardDTO1 = boardRepository.write1(findById);
                if (boardDTO1) {
                    System.out.println("게시글의 제목을 수정하세요 : ");
                    String title = scanner.next();
                    System.out.println("게시글의 내용을 수정하세요 : ");
                    String text = scanner.next();
                    boolean result = boardRepository.update(title, text);
                }
            } else {
                System.out.println("수정할 게시글의 작성자가 아닙니다.");
            }
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }

    public void delete() {
        List<BoardDTO> boardDTOList = boardRepository.list();
        System.out.println("삭제할 글의 id를 입력하세요");
        Long findById = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findList(findById);
        if (boardDTO != null) {
            if (CommonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
                boolean boardDTO1 = boardRepository.delete(findById);
                if (boardDTO1) {
                    System.out.println("게시글이 삭제되었습니다.");
                }
            } else {
                System.out.println("삭제할 게시글의 작성자가 아닙니다.");
            }
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }

    public void search() {
        System.out.println("찾으시는 글의 제목을 입력하세요 : ");
        String title = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(title);
        if (boardDTOList.size() > 0) {
            System.out.println("검색 결과");
            for (int i = 0; i < boardDTOList.size(); i++) {
                System.out.println(boardDTOList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}