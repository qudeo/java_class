package ch08_string;

import java.util.Scanner;

public class E02_StringEx {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        while (run) {
            String t = scanner.nextLine();
            System.out.println(t);
            if (t.equals("종료")){
                run = false;
            }
        }
    }
}
