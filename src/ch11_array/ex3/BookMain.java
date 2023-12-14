package ch11_array.ex3;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {

    // Book 객체를 담기위한 bookList 객체 선언
    List<Book> bookList = new ArrayList<>();



    // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
        // book1.setId(100L);
        book1.setBookTitle("주술회전");
        book1.setBookAuthor("이누타미 게게");
        book1.setBookPrice(7200);
        book1.setBookPublisher("서울 문화사");
        bookList.add(book1);
    // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("귀멸의 칼날", "고토게 코요하루", 5400, "학산 문화사");
        bookList.add(book2);

        Book book3 = new Book("나의 히어로아카데미아", "호리코시 코헤이", 5500, "서울 문화사");
        bookList.add(book3);
    // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++){
            System.out.println("bookList.get(i) = " + bookList.get(i));
        }

    // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book: bookList){
            System.out.println("book = " + book);
        }

    // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경
        bookList.get(0).setBookPrice(50000);
        System.out.println("bookList = " + bookList.get(0).getBookPrice());

    // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕출판사");
        System.out.println("bookList = " + bookList.get(1).getBookPublisher());

    // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++){
            System.out.println("bookList = " + bookList.get(i));
        }

    // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book : bookList) {
            System.out.println("book = " + book);
        }
    }
}
