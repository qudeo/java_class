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
            //코멘트디티오이름을 가진 리스트의 코멘트디티오리스트 객체는 코멘트레포객체의 코멘트메소드 와 같다
            if (commentDTOList.size() > 0) {
                //만약에 코멘트디디오 리스트의 사이즈가 0보다 클때
                if (boardcheck) {
                    //만약에 보드체크가 있을때
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
            //셀렉트 는 인트타입의 스캐너 변수를 선언한것과 같다
            if (Select == 1) {
                // 만약에 셀렉트가 1과 같을때
                System.out.println("댓글 내용 : ");
                String comment = scanner.next();
                // 스트링 타입의 코멘트 변수는 스캐너를 선언한거와 같다
                CommentDTO commentDTO = new CommentDTO(findId, CommonVariables.loginEmail, comment);
                //코멘트디티오 타입의 코멘트디티오는 새로운 코멘트 디티오 객체에 파인드아이디, 커먼베리어블스.로그인이메일, 코멘트를 넣어서 얻은 결과와 같다
                boolean commentDTO1 = commentRepository.commentSave(commentDTO);
                //블린타입의 코멘트디티오1은 코멘트레포의 코멘트세이브의 코멘트디티오를 넣어 얻은 결과와 같다
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
        // 리턴없고 매개체 없는 업데이트 메소드
        System.out.println("수정할 게시글의 id 입력하세요 : ");
        Long findById = scanner.nextLong();
        // 롱타입의 파인드바이아이디는 롱타입의 스캐너를 선언한것과 같다
        BoardDTO boardDTO = boardRepository.findList(findById);
        //보드디티오타입의 보드디티오는 보드레포의 파인드리스트객체에 파인드아이디를 넣어서 얻은 결과와 같다
        if (boardDTO != null) {
            //만약에 보드디티오가 널이 아닐때
            if (CommonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
                // 만약에 커먼베리어블스.로그인이메일과 보드디티오의 보드레이터와 같을때
                boolean boardDTO1 = boardRepository.write1(findById);
                // 블린타입의 보드디티오1 는 보드레포의 레이터에 파인드아이디를 넣은 결과와 같다
                if (boardDTO1) {
                    System.out.println("게시글의 제목을 수정하세요 : ");
                    String title = scanner.next();
                    System.out.println("게시글의 내용을 수정하세요 : ");
                    String text = scanner.next();
                    boolean result = boardRepository.update(title, text);
                    //블린타입의 리절트는 보드레포의 업데이트객체에 타이틀과 텍스트를 넣어 얻은 결과와 같다
                }
            } else {
                System.out.println("수정할 게시글의 작성자가 아닙니다.");
            }
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }

    public void delete() {
        //리턴없고 매개체없는 딜리트 메소드
        List<BoardDTO> boardDTOList = boardRepository.list();
        // 보드디티오라는 이름을 가진 리스트의 보드디티오리스트는 보드레포의 리스트 객체와 같다
        System.out.println("삭제할 글의 id를 입력하세요");
        Long findById = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findList(findById);
        //보드디티오타입의 보드디티오는 보드레포의 파인드리스트객체에 파인드아이디를 넣어 얻은 결과와 같다
        if (boardDTO != null) {
            //만약에 보드디티오가 널이 아닐때
            if (CommonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
                //만약에 커먼베리어블스.로그인이메일이 보드디티오객체의 보드레이터와 같을때
                boolean boardDTO1 = boardRepository.delete(findById);
                //블린타입의 보드디티오1은 보드레포의 딜리트객체에 파인드바이아이디를 넣어 얻은 결과와 같다
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
        // 리턴없고 매개체 없는 서치 메소드
        System.out.println("찾으시는 글의 제목을 입력하세요 : ");
        String title = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(title);
        // 보드디티오라는 이름을 가진 리스트의 보드디티오리스트 객체는 보드레포의 서치메소드에 타이틀을 넣어 얻은 결과와 같다
        if (boardDTOList.size() > 0) {
            // 만약에 보드디티오리스트사이즈가 0보다 클때
            System.out.println("검색 결과");
            for (int i = 0; i < boardDTOList.size(); i++) {
                //인트타입의 i는 0이며 0이 보드디티오리스트의 사이즈보다 작을때 1씩 커진다
                System.out.println(boardDTOList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}