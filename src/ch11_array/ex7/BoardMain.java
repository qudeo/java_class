package ch11_array.ex7;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();
        boolean run = true;
        int Select = 0;

        while (run) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1.작성 | 2.목록 | 3.조회 | 4.수정 | 5.삭제 | 6.검색 | 7.테스트데이터 | 8.종료");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("선택 > ");
            Select = scanner.nextInt();
            if (Select == 1) {
                boardService.save();
            } else if (Select == 2) {
                boardService.list();
            } else if (Select == 3) {
                boardService.findByList();
            } else if (Select == 4) {
                boardService.updata();
            } else if (Select == 5) {
                boardService.delete();
            } else if (Select == 6) {
                boardService.search();
            } else if (Select == 7) {
                boardService.testData();
            } else if (Select == 7) {
                run = false;
            } else {
                System.out.println("메뉴에서 지원하지 않는 입력값입니다.");
            }
         }
    }
}
