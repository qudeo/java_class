package ch12_map.Ex02;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();
    public void save() {
        System.out.print("도서 명");
        String bookTitle = scanner.next();
        System.out.print("저자 명");
        String bookAuthor = scanner.next();
        System.out.print("돈");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.save (bookDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findAll() {
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for (Long i : bookDTOMap.keySet()) {
            System.out.println(bookDTOMap.get(i));
            // 도서 제목만
        }
    }
    
    public void findById() {
        System.out.println("조회 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("bookDTO = " + bookDTO);
        }
    }

    public void updata() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.print("수정할 Id : ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null){
            System.out.println("수정할 가격 : ");
            int bookPrice = scanner.nextInt();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }


    public void delete() {
        System.out.println("삭제할 id : ");
        Long id = scanner.nextLong();
        boolean result = bookRepository.delete(id);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }

    public void search() {
        System.out.println("검색어 : ");
        String bookTitle = scanner.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO: bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        }else {
            System.out.println("검색 결과가 없습니다!");
        }
    }
}
