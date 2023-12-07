package my;

import java.util.Scanner;

public class Ex01_My {
    public static void main(String[] args) {



        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("내려찍을 대상을 입력하시오.");
        String t = scanner.nextLine();

        while (true) {
            int i = ((int)(Math.random() * 10) + 1);
            sum = sum + i;
            System.out.println("도끼로 " + t + "(을)를 " + i + "회 찍어내렸습니다.");
            if (i == 10){
                System.out.println(t + "(이)가 도끼질 " + sum + "회로 사망하였습니다.");
                break;
            }
        }

    }
}
