package ch10_class.ex2;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체 선언
        Student student1 = new Student();
        // Student 클래스의 필드에 값 저장하기
        student1.studentName = "학생1";
        student1.studentMajor = "컴퓨터공학";
        student1.studentMobile = "111-1111-1111";
        System.out.println("student1.studentName = " + student1.studentName);
        System.out.println("student1.studentMajor = " + student1.studentMajor);
        System.out.println("student1.studentMobile = " + student1.studentMobile);

        //
        Student student2 = new Student();
        student2.studentName = "학생2";
        student2.studentMajor = "경영학";
        student2.studentMobile = "010-2222-2222";
        System.out.println("student2.studentName = " + student2.studentName);
        System.out.println("student2.studentMajor = " + student2.studentMajor);
        System.out.println("student3.studentMobile = " + student2.studentMobile);

    }
}
