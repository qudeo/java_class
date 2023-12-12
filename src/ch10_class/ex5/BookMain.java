package ch10_class.ex5;

public class BookMain {
    public static void main(String[] args) {
        // 책 정보는 시중에 있는 실제 책으로 해봅시다.
        // 기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "Harry Potter";
        book1.bookAuthor = "J. K. Rowling";
        book1.bookPublisher = "문학수첩";
        book1.isbn = "9788983927620";
        book1.bookPrice = "7200";

        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("Harry Potter", "J. K. Rowling");

        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("Harry Potter", "J. K. Rowling", "문학수첩", "9788983927620", "7200");

    }
}
