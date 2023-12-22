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
    //보드레포지토리타입의 보드레포지토리 객체를 선언한다 = 새로히 보드레포지토리클래스를 호출한다
    //보드레포지토리클래스를 보드레포지토리타입의 보드레포지토리객체를 새롭게 선언해서 호출하여 값을 담는다
    CommentRepository commentRepository = new CommentRepository();
    //코멘트레포지토리타입의 코멘트레포지토리 객체를 선언한다 = 새로히 보드레포지토리클래스를 호출한다
    //코멘트레포지토리클래스를 코멘트레포지토리타입의 코멘트레포지토리객체를 새롭게 선언해서 호출하여 값을 담는다
    Scanner scanner = new Scanner(System.in);
    //스캐너 타입의 스캐너 변수는 새롭게 등록한 스캐너랑 같다

    public void write() {
        // 라이트 메소드
        System.out.print("제목 : ");
        String title = scanner.next();
        // 스트링 타입의 타이틀 변수는 스캐너로 입력한 값과 같다
        System.out.print("내용 : ");
        String text = scanner.next();
        // 스트링 타입의 텍스트 변수는 스캐너로 입력한 값과 같다
        boolean result = boardRepository.write(title, text);
        //블린 타입의 리절트 변수는 보드레포객체의 라이트 메소드에 타이틀과 텍스트 매개체를 가지고있는것과 같다
        if (result) {
            // 만약에 리절트값이라면
            System.out.println("글작성 완료");
        } else {
            //그게 아니라면
            System.out.println("글작성 실패");
        }
    }

    public void list() {
        //리턴값이 없고 매개변수가 없는 리스트 메소드
        List<BoardDTO> boardDTOList = boardRepository.list();
        //보드디티오이름을 가진 리스트의 보드디티오리스트 객체는 보드레포객체의 리스트 메소드 와 같다
        System.out.println(boardDTOList);
    }

    public void findList() {
        //리턴이 없고 매개체도 없는 파인드리스트 메소드
        System.out.print("조회할 글의 id를 입력하세요 : ");
        Long findId = scanner.nextLong();
        //롱타입의 파인드아이디 변수는 롱타입의 스캐너 값과 같다
        BoardDTO boardDTO = boardRepository.findList(findId);
        //보드디티오 타입을 가진 보드디티오 객체는 보드레포 객체의 파인드리스트 메소드의 파인드리스트에 전달한 파인드아이디 라는 변수 값을 사용하여 돌아온 값과 같다
        int Select = 0;
        // 인트타입의 셀렉트는 0과 값이 같다
        if (boardDTO != null) {
            //만약에 보드디티오랑 널이 같지않을때
            System.out.println(boardDTO);
            System.out.println("== 댓글 ==");
            boolean boardcheck = commentRepository.boardcheck(findId);
            //블린타입의 보드체크 변수는 코멘트레포 객체의 보드체크 메소드의 보드체크에 전달한 파인드아이디 라는 변수 값을 사용하여 돌아온 값과 같다
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